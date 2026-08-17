package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // anotation para especificar que é um Controller
@RequestMapping("/ninjas") // anotation para mapear as rotas e colocar todas no msm lugar
public class NinjaController {

    private NinjaService ninjaService; // Injetando a dependencia de NinjaService

    public NinjaController (NinjaService ninjaService){ // Construtor referenciando o NinjaService para utilizar os seus métodos
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas") // pega as informaçoes de boas vindas e cria uma rota /boasVindas (boa prática: usar /)
    public String boasVindas(){
        return "Essa é minha primeira mensagem na rota";
    }

    // CRUDE NA PRÁTICA:
    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){ // anotation para especificar que o arquivo json vai ser inserido no corpo da nosssa requisição para fazer a serialiação inversa
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){ // anotation para especificar que faz parte do nosso caminho
        return ninjaService.listarPorId(id);
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterarId")
    public String alterarNinjaPorId(){
        return "Alterar Ninja por Id.";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
    }
}
