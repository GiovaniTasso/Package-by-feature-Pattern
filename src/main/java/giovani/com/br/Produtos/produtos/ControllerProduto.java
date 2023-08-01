package giovani.com.br.Produtos.produtos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/produto")
public class ControllerProduto {

    @Autowired
    ServiceProduto serviceProduto;

    @GetMapping(value = "/consultar/id")
    public List<ClassProduto> ConsultarProduto(@RequestParam Long id){
        try {
            return serviceProduto.ConsultarProdutoId(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping(value = "/consultar/nome")
    public List<ClassProduto> consultarProdutoNome(@RequestParam String nome){
        try {
            return serviceProduto.ConsultarProdutoNome(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/salvar")
    public ClassProduto adicionarProduto(@RequestBody ClassProduto request) {

        try {
            return serviceProduto.adicionar(request);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
