package br.univille.planyourtrip.service;

import java.util.List;
import br.univille.planyourtrip.entity.Cliente;

public interface ClienteService {
    void save(Cliente cliente);
    Cliente getById(long id);
    List<Cliente> getAll();
    Cliente delete(long id);
}
