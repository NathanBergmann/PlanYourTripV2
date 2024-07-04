package br.univille.planyourtrip.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class DestinosViagem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private Destino destino;

    public Destino getDestino(){
        return destino;
    }

    public void setDestino(Destino destino){
        this.destino = destino;
        return;
    }
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


}
