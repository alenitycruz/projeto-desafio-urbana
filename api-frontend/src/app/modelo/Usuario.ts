import { Cartao } from "./Cartao";

export class Usuario{
  id:number = 0;
  nome:string = '';
  email:string = '';
  senha:string = '';
  listaCartoes:Cartao[]= [];
}
