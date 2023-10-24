import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cartao } from '../modelo/Cartao';

@Injectable({
  providedIn: 'root'
})
export class CartaoservicoService {

  private urlCartao:string = 'http://localhost:8080/cartao';

  constructor(private httpCartao: HttpClient) { }

  selecionarTodosOsCartoes():Observable<Cartao[]>{
    return this.httpCartao.get<Cartao[]>(this.urlCartao);
  }
 
  cadastrarCartao(obj:Cartao):Observable<Cartao>{
    return this.httpCartao.post<Cartao>(this.urlCartao, obj);
  }

  editarCartaoService(obj:Cartao):Observable<Cartao>{
    return this.httpCartao.put<Cartao>(this.urlCartao, obj);
  }

  removerCartaoService(idCartao:number):Observable<void> {
    return this.httpCartao.delete<void>(this.urlCartao + '/' + idCartao);
  }

}
