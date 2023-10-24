package br.com.pe.urbana.apibackend.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pe.urbana.apibackend.modelo.Usuario;
import br.com.pe.urbana.apibackend.repositorio.Repositorio;
import jakarta.persistence.EntityNotFoundException;

@Service
public class Servico {

    @Autowired
    private Repositorio acao;
 
    
    public Iterable<Usuario> mostrarUsuariosServico() {
        return acao.findAll();
    }

   
    public Usuario cadastrarUsuarioServico(Usuario u){
        return acao.save(u);

    }

    
    public Usuario alterarUsuarioServico(Usuario u){
        return acao.save(u);

    }

    public Usuario buscarPorId(Long id) {
		return acao.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Esse índice não existe no banco. Tente novamente"));
	}

    
    
    public void removerUsuarioServico(Long id) {
        Usuario usuario = this.buscarPorId(id);
        acao.delete(usuario);
    }
}
