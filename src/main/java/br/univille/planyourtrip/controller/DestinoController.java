package br.univille.planyourtrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.planyourtrip.entity.Destino;

@Controller
@RequestMapping("/destinos")
public class DestinoController {
 
    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("destino/index");
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var destino = new Destino();
        return new ModelAndView("destino/form","destino",destino);
    }
}
