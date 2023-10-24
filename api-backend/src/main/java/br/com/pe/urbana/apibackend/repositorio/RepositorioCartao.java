package br.com.pe.urbana.apibackend.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.pe.urbana.apibackend.modelo.Cartao;

public interface RepositorioCartao extends CrudRepository<Cartao, Long> {
    
}
