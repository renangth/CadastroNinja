package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController // anotation para especificar que é um Controller
@RequestMapping // anotation para mapear as rotas e colocar todas no msm lugar
public class NinjaController {

    @GetMapping("/boasvindas") // pega as informaçoes de boas vindas e cria uma rota /boasVindas (boa prática: usar /)
    public String boasVindas(){
        return "Essa é minha primeira mensagem na rota";
    }

    // CRUDE NA PRÁTICA:
    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado.";
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja.";
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/ninjasID")
    public String mostarNinjaPorId(){
        return "Mostar Ninja por Id.";
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterarPorId")
    public String alterarNinjaPorId(){
        return "Alterar Ninja por Id.";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado.";
    }
}
