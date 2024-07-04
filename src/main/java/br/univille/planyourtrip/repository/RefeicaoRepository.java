package br.univille.planyourtrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.planyourtrip.entity.Refeicao;

@Repository
public interface RefeicaoRepository extends JpaRepository<Refeicao, Long>{
    
}



