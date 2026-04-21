package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController // anotation para especificar que é um Controller
@RequestMapping // anotation para mapear as rotas e colocar todas no msm lugar
public class NinjaController {

    @GetMapping("/boasvindas") // pega as informaçoes de boas vindas e cria uma rota /boasVindas (boa prática: usar /)
    public String boasVindas(){
        return "Essa é minha primeira mensagem na rota";
    }
}
