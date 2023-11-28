package br.com.luiscutilak.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CandidateController {
    

    @PostMapping("/")
    public void create(Candidate String) {  //criando candidato
        
    }

}
