package br.pucrs.joao.antunes04.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/biblioteca")
public class ExemploController {

    @GetMapping("/")
    public String getMensagemInicial(){
        return "Aplicação Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
    public String getLivros(){
        return "Endpoint de livros...";
    }
    

}
