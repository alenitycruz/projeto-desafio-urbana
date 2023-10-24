import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from '../modelo/Usuario';
import { Cartao } from '../modelo/Cartao';

@Injectable({
  providedIn: 'root'
})
export class UsuarioservicoService {

  private urlUsuario:string = 'http://localhost:8080';
  private urlCartao:string = 'http://localhost:8080/cartao';

  constructor(private http: HttpClient) { }

  selecionarTodosOsUsuarios():Observable<Usuario[]> {
    return this.http.get<Usuario[]>(this.urlUsuario);
  }

  selecionarCartoesDoUsuario():Observable<Cartao[]> {
    return this.http.get<Cartao[]>(this.urlCartao);
  }


  cadastrarUsuario(obj:Usuario):Observable<Usuario>{
    return this.http.post<Usuario>(this.urlUsuario, obj);
  }


   cadastrarCartao(obj:Cartao):Observable<Cartao>{
    return this.http.post<Cartao>(this.urlCartao, obj);
  }


  editarUsuarioService(obj:Usuario):Observable<Usuario>{
    return this.http.put<Usuario>(this.urlUsuario, obj);
  }


  removerUsuarioService(id:number):Observable<void> {
    return this.http.delete<void>(this.urlUsuario + '/' + id);
  }



}
