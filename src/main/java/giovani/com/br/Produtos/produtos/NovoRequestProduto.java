package giovani.com.br.Produtos.produtos;


import org.springframework.beans.factory.annotation.Value;

public interface NovoRequestProduto {

    @Value("#{target.id}")
    Long getId();
    @Value("#{target.nome}")
    String getNome();
    @Value("#{target.valor}")
    double getValor();
    @Value("#{target.descricao}")
    String getDescricao();
    @Value("#{target.quantidade}")
    int getQuantidade();
}
