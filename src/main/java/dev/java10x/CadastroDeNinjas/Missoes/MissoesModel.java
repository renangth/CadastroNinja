package dev.java10x.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private char dificuldade;

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
