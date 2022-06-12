package teddo.todo.training.komakompasset.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import teddo.todo.training.komakompasset.model.CalculationEntry;
import teddo.todo.training.komakompasset.service.CalculationService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BackendRestController {
    ResponseEntity<?> output;
    @Autowired
    CalculationService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/helloworldmessage")
    public ResponseEntity<?> getHelloWorld(){

        var helloWorldMessage = "Hej Mikael :) Spring Boot og VUE rocks!";


        ObjectMapper mapper = new ObjectMapper();
        try {
            output = ResponseEntity.ok(mapper.writeValueAsString(helloWorldMessage));
        } catch (JsonProcessingException ex) {
            output = ResponseEntity.internalServerError().body(ex.getMessage());
        }

        return output;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/getData")
    public ResponseEntity<?> getFrontendData(){
        var calculations = new ArrayList<CalculationEntry>();

        calculations = service.getCalculations();


        ObjectMapper mapper = new ObjectMapper();
        try {
            output = ResponseEntity.ok(mapper.writeValueAsString(calculations));
        } catch (JsonProcessingException ex) {
            output = ResponseEntity.internalServerError().body(ex.getMessage());
        }

        return output;
    }
}