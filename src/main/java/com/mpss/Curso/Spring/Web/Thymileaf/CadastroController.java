package com.mpss.Curso.Spring.Web.Thymileaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroController {


    @RequestMapping("/")
    public String primeiroAppWeb(Model model){

        model.addAttribute("mensagen", "Estudando SpringBoot criando Api Basico");
        model.addAttribute("sobre", "Aula 1  - Criando projeto SpringBoot, é salvando no github");

        return "index";

    }
}
