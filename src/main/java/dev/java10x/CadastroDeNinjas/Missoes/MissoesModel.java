package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private char dificuldade;

    //@OneToMany: Na classe missao, pode haver mais de um ninja (um pra muitos)
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    //noArgs Constructor
    public MissoesModel () {

    }

    //AllArgs Constructor
    public MissoesModel(String nome, char dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    //Getters e Setters:
    public String getNome() {
        return nome;
    }

    public void setNome(){

    }

    public char getDificuldade(){
        return dificuldade;
    }

    public void setDificuldade(){

    }
}
