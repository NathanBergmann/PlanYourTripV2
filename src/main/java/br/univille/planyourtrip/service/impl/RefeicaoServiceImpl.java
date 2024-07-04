package br.univille.planyourtrip.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.planyourtrip.entity.Refeicao;
import br.univille.planyourtrip.repository.RefeicaoRepository;
import br.univille.planyourtrip.service.RefeicaoService;

@Service
public class RefeicaoServiceImpl implements RefeicaoService {

    @Autowired
    private RefeicaoRepository repository;

    @Override
    public void save(Refeicao refeicao) {
        repository.save(refeicao);
    }

    @Override
    public Refeicao getById(long id) {
        return repository.getById(id);
    }

    @Override
    public List<Refeicao> getAll() {
        return repository.findAll();
    }

    @Override
    public Refeicao delete(long id) {
        var refeicao = getById(id);
        repository.deleteById(id);
        return refeicao;
    }
    
}
