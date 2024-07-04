package br.univille.planyourtrip.entity;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Viagem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="viagem_id")
    private List<DestinosViagem> listaDestinos = new ArrayList<>();

    private String nome;

    public List<DestinosViagem> getDestinosViagem() {
        return listaDestinos;
    }
    
    public void setDestinos(List<DestinosViagem> destinos){
        this.listaDestinos = destinos;
        return;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
        return;
    }

    public String getNome(){
        return this.nome;
    }
}
