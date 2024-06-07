package br.univille.planyourtrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.planyourtrip.entity.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long>{
    
}
