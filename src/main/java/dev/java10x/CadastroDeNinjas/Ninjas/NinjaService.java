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

    // Deletar um ninja - Tem que ser um metodo VOID pq o delete nao retorna nada, apenas exclui.
    public void deletarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
        System.out.println("Ninja Deletado com sucesso!");
    }

    // Atualizar um ninja por id
    public NinjaModel atualizarNinjaPorId(Long id, NinjaModel ninjaAtualizado){
        if(ninjaRepository.existsById(id)){ // se o id existir
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }
}

