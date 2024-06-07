package br.univille.planyourtrip.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.planyourtrip.entity.Atividade;
import br.univille.planyourtrip.service.AtividadeService;
import br.univille.planyourtrip.service.DestinoService;

@Controller
@RequestMapping("/atividades")
public class AtividadeController {
    
    @Autowired
    private AtividadeService service;

    @Autowired
    private DestinoService serviceDestino;

    @GetMapping
    public ModelAndView index(){
        var listaAtividades = service.getAll();
        var listaDestinos = serviceDestino.getAll();
        HashMap<String, Object> dados= new HashMap<>();
        dados.put("listaAtividades",listaAtividades);
        dados.put("listaDestinos", listaDestinos);
        return new ModelAndView("atividade/index",dados);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var atividade = new Atividade();
        var listaDestinos = serviceDestino.getAll();
        HashMap<String, Object> dados= new HashMap<>();
        dados.put("atividade",atividade);
        dados.put("listaDestinos", listaDestinos);
        return new ModelAndView("atividade/form",dados);
    }

    @PostMapping
    public ModelAndView save(Atividade atividade){
        service.save(atividade);
        return new ModelAndView("redirect:/atividades");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var atividade = service.getById(id);
        var listaDestinos = serviceDestino.getAll();
        HashMap<String, Object> dados= new HashMap<>();
        dados.put("atividade",atividade);
        dados.put("listaDestinos", listaDestinos);
        return new ModelAndView("atividade/form", dados);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/atividades");
    }

}
