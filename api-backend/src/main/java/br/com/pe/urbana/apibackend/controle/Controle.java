package br.com.pe.urbana.apibackend.controle;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pe.urbana.apibackend.modelo.Usuario;
import br.com.pe.urbana.apibackend.servico.Servico;

@RestController
@CrossOrigin(origins = "*")
public class Controle {
    @Autowired
    private Servico servico;
 
    @GetMapping
    public ResponseEntity<Iterable<Usuario>> mostrarUsuarios() {
        return ResponseEntity.ok(servico.mostrarUsuariosServico());
    }


    @PostMapping
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario u){
        return ResponseEntity.ok(servico.cadastrarUsuarioServico(u));

    }

    @PutMapping
    public ResponseEntity<Usuario> alterarUsuario(@RequestBody Usuario u){
        return ResponseEntity.ok(servico.alterarUsuarioServico(u));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> remover(@PathVariable Long id) {

        try {

            servico.removerUsuarioServico(id);
            return ResponseEntity.ok().build();
            
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }

        
    }
    
}
