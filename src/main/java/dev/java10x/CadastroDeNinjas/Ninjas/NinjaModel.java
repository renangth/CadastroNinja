package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Entity transforma classe java em entidade no BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro_ninja")
public class NinjaModel {

    @Id // define os id's automaticamente
            @GeneratedValue(strategy = GenerationType.IDENTITY) // passo a estrtégia de como definir o ID
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private List<MissoesModel> missoes;

    //noArgs constructor
    public NinjaModel() {

    }

    //AllArgs constructor
    public NinjaModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // getters e setters nome
    public String getNome() {
        return nome;
    }

    public void setNome(){
    }

    //getters e setters email
    public String getEmail() {
        return email;
    }

    public void setEmail(){
    }

    //getters e setters idade
    public int getIdade() {
        return idade;
    }
     public void setIdade(){
     }
}
