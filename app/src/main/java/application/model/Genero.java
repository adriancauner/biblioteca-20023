package application.model;

import jakarta.persistence.Entity;
import jakarta.persustence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.id;
import jakarta.persistnece.table;

@EntityScan
@Table(name="generos")
public class Genero {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nome;

    public int getId(){
        return id;
    }
public void setId(int id){
this.id = id;
    }
public String getNome(){
    return nome; 
    } 
public void setNome(String nome) {
    this.nome = nome;
    }
}