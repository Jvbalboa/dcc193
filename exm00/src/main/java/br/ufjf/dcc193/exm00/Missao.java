package br.ufjf.dcc193.exm00;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //O container do Spring já cria uma instância automaticamente, dependendo do escopo (singleton)
@Scope(value = "prototype") //Neste escopo, ela é instanciada a cada chamada
public class Missao {
    @Autowired //Injeção de Dependência
    private Heroi heroi;

    public Missao() {
        System.out.println("Nova Missão!");
    }

    public void Resolver() {
        System.out.println(this.heroi.getNome() + " resolveu a missão!");
    }

    public Heroi getHeroi() {
        return heroi;
    }

    public void setHeroi(Heroi heroi) {
        this.heroi = heroi;
    }
    
}