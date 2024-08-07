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
    private int quantidadeNoite;
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

    public void setQuantidadeNoites (int quantidade){
        this.quantidadeNoite = quantidade;
    }

    public int getQuantidadeNoites (){
        return this.quantidadeNoite;
    }

    public void setValorNoite (Double valor){
        this.valorNoite = valor;
    }

    public Double getValorNoite (){
        return this.valorNoite;
    }

    public Boolean getVaiDormir (){
        return this.vaiDormir;
    }

    public void setVaiDormir (Boolean vaiDormir){
        this.vaiDormir = vaiDormir;
    }
}
