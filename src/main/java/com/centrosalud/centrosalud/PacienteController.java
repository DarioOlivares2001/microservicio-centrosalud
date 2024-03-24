package com.centrosalud.centrosalud;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class PacienteController {

    List<Paciente> pacientes = new ArrayList<>();
    List<HistorialMedico> historias = new ArrayList<>();

    public PacienteController() {
        pacientes.add(new Paciente(1, "13343401-1", "Dario", "Olivares", "Ortiz", "+56982536263", 30, 
        Arrays.asList(
                        new HistorialMedico(8384, new Profesional("20583695-5", "Ernesto Padilla","Medicina General"), 
                        Arrays.asList(new Dolencia("0000001", "DESNUTRIDO")),
                        llenarReceta("DESNUTRIDO", "VITAMINA C", "VITAMINA D", "VITAMINA B"),
                        LocalDateTime.of(2024, 10, 12, 4, 5)                        
                        )
                     )
                )

            );


        pacientes.add(new Paciente(2, "23652653-1", "Marco", "Aurelio", "Emperor", "+5698236521", 36, 
        Arrays.asList(
                        new HistorialMedico(5284, new Profesional("23659685-5", "Feid Roth","Neurologia"), 
                        Arrays.asList(new Dolencia("0000001", "Neurosis")),
                        llenarReceta("Neurosis", "DOLOMIT", "AGUITA PERRA", "UN SANA SANA"),
                        LocalDateTime.of(2024, 7, 8, 4, 5)                        
                        )
                        ,
                        new HistorialMedico(8384, new Profesional("23659685-5", "Alan Garcia","Traumatologo"), 
                        Arrays.asList(new Dolencia("0000001", "CANSANCIO")),
                        llenarReceta("CANSANCIO", "PANADOL", "COCAINA", "PULSAR") ,
                        LocalDateTime.of(2024, 1, 2, 3, 4)                                               
                        )
                        )
                )
            );            
    }

    private Map<String, List<String>> llenarReceta(String dolencia, String medicamento1, String medicamento2,
            String medicamento3) {
        Map<String, List<String>> receta = new HashMap<>();
        List<String> medicamentos = Arrays.asList(medicamento1, medicamento2, medicamento3);
        receta.put(dolencia, medicamentos);
        return receta;
    }

    @GetMapping("/pacientes")
    public List<Paciente> getPacientes() {
        return pacientes;
    }
    
    @GetMapping("/pacientes/rut/{rut}")
    public ResponseEntity<?> getPacienteByRut(@PathVariable String rut) {
        
        for(Paciente pac : pacientes){
            if(pac.getRut().equals(rut))
            {
                return ResponseEntity.ok(pac) ;
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro el paciente con el rut " + rut);
    }

    @GetMapping("/pacientes/id/{id}")
    public ResponseEntity<?> getPacienteById(@PathVariable int id) {
        
        for(Paciente pac : pacientes){
            if(pac.getId() == id)
            {
                return ResponseEntity.ok(pac) ;
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro el paciente con el id " + id + "");
    
    }


    @GetMapping("/pacientes/profesionales")
    public ResponseEntity<?> getProfesionales() {
        List<Profesional> listaprof = new ArrayList<>();

        for(Paciente pac : pacientes){
            for(HistorialMedico h : pac.getListahistorial()){
                listaprof.add(h.getDoctor());
            }
        }
        if(!listaprof.isEmpty())
        {
            return ResponseEntity.ok(listaprof);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existen profesionales ");
    
    }
}
