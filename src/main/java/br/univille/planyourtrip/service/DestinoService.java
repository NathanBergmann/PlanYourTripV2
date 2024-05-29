package br.univille.planyourtrip.service;

import java.util.List;
import br.univille.planyourtrip.entity.Destino;;

public interface DestinoService {

    void save (Destino destino);
    Destino getById(long id);
    List<Destino> getAll();
    Destino delete (long id);
}
