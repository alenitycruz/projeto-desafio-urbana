package br.com.pe.urbana.apibackend.controle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pe.urbana.apibackend.modelo.Usuario;
import br.com.pe.urbana.apibackend.repositorio.Repositorio;

@RestController
@CrossOrigin(origins = "*")
public class Controle {

    @Autowired
    private Repositorio acao;
 
    @GetMapping
    public Iterable<Usuario> mostrarUsuarios() {
        return acao.findAll();
    }

    @PostMapping
    public Usuario cadastrarUsuarioA(@RequestBody Usuario u){
        return acao.save(u);

    }

    @PutMapping
    public Usuario alterarUsuarioA(@RequestBody Usuario u){
        return acao.save(u);

    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        acao.deleteById(id);
    }
}
