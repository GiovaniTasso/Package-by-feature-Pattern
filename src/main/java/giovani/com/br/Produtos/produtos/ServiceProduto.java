package giovani.com.br.Produtos.produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduto {

    @Autowired
    RepositoryProduto repositoryProduto;


    List<ClassProduto> ConsultarProdutoId(Long id) {

        return repositoryProduto.buscarProdutoPorId(id);
    }

    List<ClassProduto> ConsultarProdutoNome(String nome){

        return repositoryProduto.buscarProdutoPorNome(nome);
    }

    public ClassProduto adicionar(ClassProduto request) {

        ClassProduto novoProduto = new ClassProduto();
        novoProduto.setNome(request.getNome());
        novoProduto.setValor(request.getValor());
        novoProduto.setDescricao(request.getDescricao());
        novoProduto.setQuantidade(request.getQuantidade());

        return repositoryProduto.save(novoProduto);
    }
}