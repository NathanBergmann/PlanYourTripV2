package br.univille.planyourtrip.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.univille.planyourtrip.entity.Destino;
import br.univille.planyourtrip.entity.DestinosViagem;
import br.univille.planyourtrip.entity.Viagem;
import br.univille.planyourtrip.service.AtividadeService;
import br.univille.planyourtrip.service.DestinoService;
import br.univille.planyourtrip.service.ViagemService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



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
        var destinosViagem = new DestinosViagem();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("viagem",viagem);
        dados.put("destinosViagem", destinosViagem);
        dados.put("destinos",destinoService.getAll());
        return new ModelAndView("viagem/form", dados);
    }
    
    @PostMapping(params = "save")
    public ModelAndView save(Viagem viagem){

        viagemService.save(viagem);        

        return new ModelAndView("redirect:/viagens");
    }

    @PostMapping(params = "inciDestViagem")
    public ModelAndView save(Viagem viagem,
                             DestinosViagem destinosViagem){

        viagem.getDestinosViagem().add(destinosViagem);        

        HashMap<String,Object> dados = new HashMap<>();
        dados.put("viagem",viagem);
        dados.put("destinosViagem",new DestinosViagem());
        dados.put("destinos", destinoService.getAll());
        return new ModelAndView("viagem/form",dados);

    }

}
