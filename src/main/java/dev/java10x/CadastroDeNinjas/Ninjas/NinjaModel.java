package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity transforma classe java em entidade no BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro_ninja")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id // define os id's automaticamente
            @GeneratedValue(strategy = GenerationType.IDENTITY) // passo a estrtégia de como definir o ID
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne: Na classe NinjaModel só vai ter 1 missão (muitos pra um)
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;
}
