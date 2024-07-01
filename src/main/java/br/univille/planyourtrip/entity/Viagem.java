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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Viagem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="destino_id")
    private List<Destino> listaDestinos = new ArrayList<>();

    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="atividade_id")
    private List<Atividade> listaAtividades = new ArrayList<>();

    public List<Destino> getListaDestinos() {
        return listaDestinos;
    }

    public List<Atividade> getListaAtividades(){
        return listaAtividades;
    }

    public void setAtividades(List<Atividade> atividades){
        this.listaAtividades = atividades;
        return;
    }
    
    public void setDestinos(List<Destino> destinos){
        this.listaDestinos = destinos;
        return;
    }
}
