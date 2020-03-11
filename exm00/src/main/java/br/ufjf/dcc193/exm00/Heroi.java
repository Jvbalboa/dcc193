package br.ufjf.dcc193.exm00;

import org.springframework.stereotype.Component;

@Component
public class Heroi {

    private String nome;

    public Heroi() {
        System.out.println("Novo Herói.");
        this.nome = "Balboa";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
