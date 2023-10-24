import { Component, OnInit } from '@angular/core';
import { Cartao } from '../modelo/Cartao';
import { CartaoservicoService } from '../servico/cartaoservico.service';

@Component({
  selector: 'app-menu-cartao',
  templateUrl: './menu-cartao.component.html',
  styleUrls: ['./menu-cartao.component.css']
})
export class MenuCartaoComponent implements OnInit{

  cartao = new Cartao();

  btnCadastroCartao = true;

  tabelaCartao:boolean = true;

  cartoes:Cartao[] = [];

  constructor(private servicoCartao: CartaoservicoService) {}

  selecionarCartoes():void {
    this.servicoCartao.selecionarTodosOsCartoes()
      .subscribe(retorno => this.cartoes = retorno);
  }

  ngOnInit(): void {
    this.selecionarCartoes();
  }

  cadastroDeCartao():void{
    this.servicoCartao.cadastrarCartao(this.cartao)

    .subscribe(retorno => {

      this.cartoes.push(retorno);

      this.cartao = new Cartao();

      alert('Cartao cadastrado com sucesso!');
    });
  }

  selecionarCartao(posicaoCartao:number):void {
    this.cartao = this.cartoes[posicaoCartao];

    this.btnCadastroCartao = false;

    this.tabelaCartao = false;
  }

  editarCartao():void {
    this.servicoCartao.editarCartaoService(this.cartao)
    .subscribe(retorno => {

      let posicaoCartao = this.cartoes.findIndex(obj => {
        return obj.idCartao == retorno.idCartao;
      });

      this.cartoes[posicaoCartao] = retorno;

      this.cartao = new Cartao();

      this.btnCadastroCartao = true;

      this.tabelaCartao = true;

      alert('Cartão alterado com sucesso!');
    });
  }


  removerCartao():void {
    this.servicoCartao.removerCartaoService(this.cartao.idCartao)
    .subscribe(retorno => {

      let posicaoCartao = this.cartoes.findIndex(obj => {
        return obj.idCartao == this.cartao.idCartao;
      });

      this.cartoes.splice(posicaoCartao, 1);

      this.cartao = new Cartao();

      this.btnCadastroCartao = true;

      this.tabelaCartao = true;

      alert('Cartão removido com sucesso!');
    });
  }

  cancelarCartao():void {
    this.cartao = new Cartao();

    this.btnCadastroCartao = true;

    this.tabelaCartao = true;
  }

}
