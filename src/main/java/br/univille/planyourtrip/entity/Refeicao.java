package br.univille.planyourtrip.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Refeicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String typeRefeicao;
    private double custo;
    private LocalDate data;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private Destino destino;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTypeRefeicao() {
        return typeRefeicao;
    }
    public void setTypeRefeicao(String typeRefeicao) {
        String typeSave = "";
        if (typeRefeicao.equals("1")){
            typeSave = "Café da Manhã";
        } else if (typeRefeicao.equals("2")){
            typeSave = "Almoço";
        }else if (typeRefeicao.equals("3")){
            typeSave = "Lanche";
        }else if (typeRefeicao.equals("4")){
            typeSave = "Jantar";
        }
        this.typeRefeicao = typeSave;
    }
    public double getCusto() {
        return custo;
    }
    public void setCusto(double custo) {
        this.custo = custo;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Destino getDestino() {
        return destino;
    }
    public void setDestino(Destino destino) {
        this.destino = destino;
    }
}
