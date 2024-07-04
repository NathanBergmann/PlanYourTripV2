package br.univille.planyourtrip.service;

import java.util.List;

import br.univille.planyourtrip.entity.Viagem;

public interface ViagemService {
    void save(Viagem viagem);
    Viagem getById(long id);
    List<Viagem> getAll();
    Viagem delete(long id);
}
