import { Usuario } from './../modelo/Usuario';
import { Component, OnInit } from '@angular/core';
import { UsuarioservicoService } from '../servico/usuarioservico.service';
import { CartaoservicoService } from '../servico/cartaoservico.service';
import { Cartao } from '../modelo/Cartao';

@Component({
  selector: 'app-menu-usuario',
  templateUrl: './menu-usuario.component.html',
  styleUrls: ['./menu-usuario.component.css']
})
export class MenuUsuarioComponent implements OnInit{

  usuario = new Usuario();
  cartao = new Cartao();

  btnCadastro = true;

  tabela:boolean = true;

  selectedCard: any;

  usuarios:Usuario[] = [];
  cartoes:Cartao[]=[];

  constructor(private servicoUsuario: UsuarioservicoService){}

  selecionarUsuarios():void{
    this.servicoUsuario.selecionarTodosOsUsuarios()
    .subscribe(retorno => this.usuarios = retorno);

    this.servicoUsuario.selecionarCartoesDoUsuario()
    .subscribe(retornoCartao => this.cartoes = retornoCartao);
  }

  ngOnInit(): void {
    this.selecionarUsuarios();
  }

  cadastroDeUsuario():void{
    this.servicoUsuario.cadastrarUsuario(this.usuario)
    .subscribe(retorno => {

      this.usuarios.push(retorno);

      this.usuario = new Usuario();

      alert('Usuário cadastrado com sucesso!');

    });

  }

  selecionarUsuario(posicao:number):void {
    this.usuario = this.usuarios[posicao];

    this.btnCadastro = false;

    this.tabela = false;
  }

  editarUsuario():void {
    this.servicoUsuario.editarUsuarioService(this.usuario)
    .subscribe(retorno => {

      let posicao = this.usuarios.findIndex(obj => {
        return obj.id == retorno.id;
      });

      this.usuarios[posicao] = retorno;

      this.usuario = new Usuario();

      this.btnCadastro = true;

      this.tabela = true;

      alert('Usuario alterado com sucesso!');
    });
  }


  removerUsuario():void {
    this.servicoUsuario.removerUsuarioService(this.usuario.id)
    .subscribe(retorno => {

      let posicao = this.usuarios.findIndex(obj => {
        return obj.id == this.usuario.id;
      });

      this.usuarios.splice(posicao, 1);

      this.usuario = new Usuario();

      this.btnCadastro = true;

      this.tabela = true;

      alert('Usuário removido com sucesso!');
    });
  }

  cancelar():void {
    this.usuario = new Usuario();

    this.btnCadastro = true;

    this.tabela = true;
  }

}
