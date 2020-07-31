package com.dockerdebug.demo.controller;

import com.dockerdebug.demo.entity.Pessoa;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    //http://localhost:8080/pessoa/nomeCompletoO
    @GetMapping(value = "/nomeCompleto",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa getPessoaNome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Paulo11");
        pessoa.setSobrenome("Alves AS");
        return pessoa;
    }
}
