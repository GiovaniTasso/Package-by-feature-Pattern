package giovani.com.br.Produtos.produtos;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface RepositoryProduto extends JpaRepository<ClassProduto,Long> {



    @Query(value = "Select * from produtos WHERE id = :id",nativeQuery = true)
    List<ClassProduto> buscarProdutoPorId(@Param("id") Long id);

    @Query(value = "Select * from produtos WHERE nome = :nome",nativeQuery = true)
    List<ClassProduto> buscarProdutoPorNome(@Param("nome") String nome);


}
