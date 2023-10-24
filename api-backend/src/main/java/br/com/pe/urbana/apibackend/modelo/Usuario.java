package br.com.pe.urbana.apibackend.modelo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_USUARIOS")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;

    @OneToMany
    @JoinColumn(name = "codigo_cartoes")
    private List<Cartao> listaCartoes;

    
    public Usuario() {
    }


    public Usuario(Long id, String nome, String email, String senha, List<Cartao> listaCartoes) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaCartoes = listaCartoes;
    }


    public Usuario(List<Cartao> listaCartoes) {
        this.listaCartoes = listaCartoes;
    }


    
    public Usuario(String nome, String email, String senha, List<Cartao> listaCartoes) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaCartoes = listaCartoes;
    }

    


    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public List<Cartao> getListaCartoes() {
        return listaCartoes;
    }


    public void setListaCartoes(List<Cartao> listaCartoes) {
        this.listaCartoes = listaCartoes;
    }
    
    
}
