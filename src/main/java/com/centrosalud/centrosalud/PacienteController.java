package com.centrosalud.centrosalud;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class PacienteController {

    @GetMapping("/pacientes")
    public String getPacientes() {
        return "los pacientes";
    }
    
    
}
