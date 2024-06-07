package br.univille.planyourtrip.service;

import java.util.List;
import br.univille.planyourtrip.entity.Atividade;

public interface AtividadeService {
    
    void save(Atividade atividade);
    Atividade getById(long id);
    List<Atividade> getAll();
    Atividade delete(long id);
}
