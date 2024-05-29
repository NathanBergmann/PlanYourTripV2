package br.univille.planyourtrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.planyourtrip.entity.Destino;

@Repository
public interface DestinoRepository  extends
    JpaRepository<Destino, Long>{

}
