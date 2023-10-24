package br.com.pe.urbana.apibackend.controle;

import org.springframework.beans.factory.annotation.Autowired;
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
import br.com.pe.urbana.apibackend.repositorio.RepositorioCartao;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cartao")
public class ControleCartao {

    @Autowired
    private RepositorioCartao acao;

    @GetMapping
    public Iterable<Cartao> mostrarCartoes(){
        return acao.findAll();
    }

    @PostMapping
    public Cartao cadastrarCartao(@RequestBody Cartao c){
        return acao.save(c);

    }

    @PutMapping
    public Cartao alterarCartao(@RequestBody Cartao c){
        return acao.save(c);

    }

    @DeleteMapping("/{id_cartao}")
    public void removerCartao(@PathVariable Long id_cartao){
        acao.deleteById(id_cartao);
    }
    
}
