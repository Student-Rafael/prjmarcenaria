/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.maiormoveis.classes;

/**
 *
 * @author euraf
 */
public class Pessoa {
    
     // Atributos
    private String nome;
    private String id;
    private String fone;

    // Construtor
    public Pessoa(){}
    public Pessoa(String nome, String id, String fone) {
        this.nome = nome;
        this.id = id;
        this.fone = fone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
}
