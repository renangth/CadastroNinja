package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository; // Injetando a dependencia de NinjaRepository

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll(); // método do jpa para mostrar todos os dados do bd
    }

    // Listar ninjas por ID
    public NinjaModel listarPorId(Long id){
        Optional <NinjaModel> ninjaporId = ninjaRepository.findById(id);
        return ninjaporId.orElse(null);
    }

    // Criar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }
}
