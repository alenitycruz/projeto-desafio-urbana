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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pe.urbana.apibackend.modelo.Cartao;
import br.com.pe.urbana.apibackend.servico.CartaoServico;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cartao")
public class ControleCartao {

    @Autowired
    private CartaoServico servico;

    @GetMapping
    public ResponseEntity<Iterable<Cartao>> mostrarCartoes(){
        return ResponseEntity.ok(servico.mostrarCartoesService());
    }

    @PostMapping
    public ResponseEntity<Cartao> cadastrarCartao(@RequestBody Cartao c){
        return ResponseEntity.ok(servico.cadastrarCartaoService(c));

    }

    @PutMapping
    public ResponseEntity<Cartao> alterarCartao(@RequestBody Cartao c){
        return ResponseEntity.ok(servico.alterarCartaoService(c));

    }

    @DeleteMapping("/{id_cartao}")
    public ResponseEntity<Cartao> removerCartao(@PathVariable Long id_cartao){
        try {
            servico.removerCartaoService(id_cartao);
        return ResponseEntity.ok().build();
            
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
            
    }
    
}
