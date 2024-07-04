package br.univille.planyourtrip.service;

import java.util.List;

import br.univille.planyourtrip.entity.Refeicao;

public interface RefeicaoService {
    
    void save(Refeicao refeicao);
    Refeicao getById(long id);
    List<Refeicao> getAll();
    Refeicao delete(long id);
}
