package br.univille.planyourtrip.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 1000, nullable = false)
    private String descricao;
    @Column(length = 2000)
    private Boolean vaiDormir;
    private int quantidadeNoites;
    private double valorNoite;

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    public void setDescricao(String descricao ){
        this.descricao = descricao;
    }

    public String getDescricao (){
        return this.descricao;
    }

    public void setQuantidade (int quantidade){
        this.quantidadeNoites = quantidade;
    }

    public int getQuantidade (){
        return this.quantidadeNoites;
    }

    public void valorNoite (Double valor){
        this.valorNoite = valor;
    }

    public Double getValorNoite (){
        return this.valorNoite;
    }
}
