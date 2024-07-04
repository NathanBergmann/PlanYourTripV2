package br.univille.planyourtrip.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.planyourtrip.entity.Viagem;
import br.univille.planyourtrip.repository.ViagemRepository;
import br.univille.planyourtrip.service.ViagemService;

@Service
public class ViagemServiceImpl 
    implements ViagemService{
    
    @Autowired
    private ViagemRepository repository;

    @Override
    public void save(Viagem viagem){
        repository.save(viagem);
    }
 
    @Override
    public Viagem getById(long id) {
        return repository.getById(id);
    }

    @Override
    public List<Viagem> getAll() {
        return repository.findAll();
    }

    @Override
    public Viagem delete(long id) {
        var viagem = getById(id);
        repository.delete(viagem);
        return viagem;
    }

}
