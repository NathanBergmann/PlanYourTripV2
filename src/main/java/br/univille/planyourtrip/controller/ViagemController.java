package br.univille.planyourtrip.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.univille.planyourtrip.entity.Viagem;
import br.univille.planyourtrip.service.AtividadeService;
import br.univille.planyourtrip.service.DestinoService;
import br.univille.planyourtrip.service.ViagemService;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/viagens")

public class ViagemController {
 
    @Autowired
    private DestinoService destinoService;
    @Autowired
    private ViagemService viagemService;


    @GetMapping
    public ModelAndView index() {
        var listaViagens = viagemService.getAll();
        return new ModelAndView("viagem/index","listaViagens", listaViagens);
    }
    

    @GetMapping("/nova")
    public ModelAndView nova() {
        var viagem = new Viagem();
        HashMap<String,Object> dados = new HashMap<>();
        // dados.put("viagem",viagem);
        // dados.put("destinos",destinoService.getAll());
        // dados.put("atividades", atividadeService.getAll());
        return new ModelAndView("viagem/form", dados);
    }
    

}
