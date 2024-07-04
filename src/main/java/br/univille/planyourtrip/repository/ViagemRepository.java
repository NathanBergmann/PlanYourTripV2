package br.univille.planyourtrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.planyourtrip.entity.Viagem;

@Repository
public interface ViagemRepository 
    extends JpaRepository<Viagem, Long>{
    
}
