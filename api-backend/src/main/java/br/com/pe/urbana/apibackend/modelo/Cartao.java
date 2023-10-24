package br.com.pe.urbana.apibackend.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CARTOES")
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCartao;
    private Integer numeroCartao;
    private String nomeCartao;
    private Boolean status;

    @Enumerated(EnumType.STRING)
    private TipoDeCartao tipo;

    
    public Cartao() {
    }
    

    public Cartao(Long idCartao, Integer numeroCartao, String nomeCartao, Boolean status, TipoDeCartao tipo) {
        this.idCartao = idCartao;
        this.numeroCartao = numeroCartao;
        this.nomeCartao = nomeCartao;
        this.status = status;
        this.tipo = tipo;
    }


    public Cartao(TipoDeCartao tipo) {
        this.tipo = tipo;
    }


    public Cartao(Integer numeroCartao, String nomeCartao, Boolean status, TipoDeCartao tipo) {
        this.numeroCartao = numeroCartao;
        this.nomeCartao = nomeCartao;
        this.status = status;
        this.tipo = tipo;
    }


    public Long getIdCartao() {
        return idCartao;
    }


    public void setIdCartao(Long idCartao) {
        this.idCartao = idCartao;
    }


    public Integer getNumeroCartao() {
        return numeroCartao;
    }


    public void setNumeroCartao(Integer numeroCartao) {
        this.numeroCartao = numeroCartao;
    }


    public String getNomeCartao() {
        return nomeCartao;
    }


    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }


    public Boolean getStatus() {
        return status;
    }


    public void setStatus(Boolean status) {
        this.status = status;
    }


    public TipoDeCartao getTipo() {
        return tipo;
    }


    public void setTipo(TipoDeCartao tipo) {
        this.tipo = tipo;
    }

    
}
