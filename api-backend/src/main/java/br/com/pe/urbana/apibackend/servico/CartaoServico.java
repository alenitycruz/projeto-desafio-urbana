package br.com.pe.urbana.apibackend.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pe.urbana.apibackend.modelo.Cartao;
import br.com.pe.urbana.apibackend.repositorio.RepositorioCartao;
import jakarta.persistence.EntityNotFoundException;

@Service
public class CartaoServico {

    @Autowired
    private RepositorioCartao acao;

    public Iterable<Cartao> mostrarCartoesService(){
        return acao.findAll();
    }

    public Cartao cadastrarCartaoService(Cartao c){
        return acao.save(c);

    }

    public Cartao alterarCartaoService(Cartao c){
        return acao.save(c);

    }

    public Cartao buscarPorId(Long id) {
		return acao.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Esse índice não existe no banco. Tente novamente"));
	}

    public void removerCartaoService(Long id_cartao){
        Cartao cartao = this.buscarPorId(id_cartao);
        acao.delete(cartao);
    }
    
}
