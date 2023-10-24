package br.com.pe.urbana.apibackend.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.pe.urbana.apibackend.modelo.Usuario;

public interface Repositorio extends CrudRepository<Usuario, Long>{
    
}
