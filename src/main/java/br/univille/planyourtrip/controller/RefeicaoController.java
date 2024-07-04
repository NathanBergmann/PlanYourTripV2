package br.univille.planyourtrip.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.univille.planyourtrip.entity.Refeicao;
import br.univille.planyourtrip.service.DestinoService;
import br.univille.planyourtrip.service.RefeicaoService;

@Controller
@RequestMapping("/refeicoes")
public class RefeicaoController {
    @Autowired
    private RefeicaoService service;

    @Autowired
    private DestinoService serviceDestino;

    @GetMapping
    public ModelAndView index(){
        var listaRefeicao = service.getAll();
        var listaDestinos = serviceDestino.getAll();
        HashMap<String, Object> dados= new HashMap<>();
        dados.put("listaRefeicoes",listaRefeicao);
        dados.put("listaDestinos", listaDestinos);
        return new ModelAndView("refeicao/index",dados);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var refeicao = new Refeicao();
        var listaDestinos = serviceDestino.getAll();
        HashMap<String, Object> dados= new HashMap<>();
        dados.put("refeicao",refeicao);
        dados.put("listaDestinos", listaDestinos);
        return new ModelAndView("refeicao/form",dados);
    }

    @PostMapping
    public ModelAndView save(Refeicao refeicao){
        service.save(refeicao);
        return new ModelAndView("redirect:/refeicoes");
    }
    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var refeicao = service.getById(id);
        var listaDestinos = serviceDestino.getAll();
        HashMap<String, Object> dados= new HashMap<>();
        dados.put("refeicao",refeicao);
        dados.put("listaDestinos", listaDestinos);
        return new ModelAndView("refeicao/form", dados);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/refeicoes");
    }
}
