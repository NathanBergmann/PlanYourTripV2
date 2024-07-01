package br.univille.planyourtrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.planyourtrip.entity.Destino;
import br.univille.planyourtrip.service.DestinoService;

@Controller
@RequestMapping("/destinos")
public class DestinoController {
 
    @Autowired
    private DestinoService service;

    @GetMapping
    public ModelAndView index(){
        var listaDestino = service.getAll();
        return new ModelAndView("destino/index", "listaDestino",listaDestino);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var destino = new Destino();
        return new ModelAndView("destino/form","destino",destino);
    }

    @PostMapping
    public ModelAndView save(Destino destino){
        service.save(destino);
        return new ModelAndView("redirect:/destinos");
    }

    
    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var destino = service.getById(id);
        return new ModelAndView("destino/form", "destino",destino);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/destinos");
    }
}
