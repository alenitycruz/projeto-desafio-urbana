# Projeto Desafio Urbana


Aplicação criada para cadastro de usuário e cartões.

>Tecnologias utilizadas
- Spring boot
- Openjdk version "18.0.1"
- Angular CLI: 16.2.6
- Node: 18.12.1
- Package Manager: npm 8.19.2
- BootStrap 5
- IDE: VSCODE
- PostgreSQL

>Entidades
- Usuário
- Cartão

>Requisições HTTP de Usuário(Backend)

| Tipo     |  EndPoint   |
|:--------:|:-----------:|
| POST     | http://localhost:8080   |
| GET      | http://localhost:8080 |
| PUT      | http://localhost:8080 |
| DELETE   | http://localhost:8080/{id} |


>Requisições HTTP de Cartão(Backend)

| Tipo     |  EndPoint   |
|:--------:|:-----------:|
| POST     | http://localhost:8080/cartao   |
| GET      | http://localhost:8080/cartao |
| PUT      | http://localhost:8080/cartao |
| DELETE   | http://localhost:8080/cartao/{id} |






>Sugestão de JSON pra Teste de integração no Postman ou afins - POST Cartão

- Primeiro Cartão:
   {
        "numeroCartao": 1234,
        "nomeCartao": "Comum",
        "status": true,
        "tipo": "COMUM"
    }

- Segundo Cartão:
    {
        "numeroCartao": 4321,
        "nomeCartao": "Trabalhador",
        "status": true,
        "tipo": "TRABALHADOR"
    }
   





>Sugestão de JSON pra Teste de integração no Postman ou afins - POST Usuário

{
    "nome":"Alessandra Cruz",
    "email":"alenity@gmail.com",
    "senha":"123",
    "listaCartoes":[
        {
        "idCartao": 1,
        "numeroCartao": 1234,
        "nomeCartao": "Comum",
        "status": true,
        "tipo": "COMUM"
    },
    {
        "idCartao": 2,
        "numeroCartao": 4321,
        "nomeCartao": "Trabalhador",
        "status": true,
        "tipo": "TRABALHADOR"
    }
    ]
}


>TELAS DA APLICAÇÃO
- Página inicial
  ![image](https://github.com/alenitycruz/projeto-desafio-urbana/assets/75428465/74510884-74e2-46ec-a003-ee8c1393704e)

- Acesso aos Cartões
  ![image](https://github.com/alenitycruz/projeto-desafio-urbana/assets/75428465/24ddac7e-fcb9-4501-b2b8-aac083622329)

- Acesso aos Usuários
  ![image](https://github.com/alenitycruz/projeto-desafio-urbana/assets/75428465/47ecf89f-1116-4898-816f-2917c64b8767)


