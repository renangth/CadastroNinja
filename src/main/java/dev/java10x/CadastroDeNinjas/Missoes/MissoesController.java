package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes") // criando um sub dominio para especificar que todo mundo nessa classe petence a missoes
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService){
        this.missoesService = missoesService;
    }

    // GET -- Mandar uma requisição para mostrar as missoes
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    // POST -- Mandar uma requisição para criar as missoes
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao){ // Anotation para fazer serialização reversa
        return missoesService.criarMissao(missao);
    }

    // PUT -- Mandar uma requisição para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso";
    }

    // DELETE -- Mandar uma requisição para deletar as missoes
    @DeleteMapping("/deletar/{id}")
    public void deletarMissaoPorId(@PathVariable Long id){ // Anotation para o usuário passar a variável do caminho
        missoesService.deletarMissaoPorId(id);
    }
}



