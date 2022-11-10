package com.survey.controller;

import com.survey.model.Survey_Table;
import com.survey.repository.Survey_TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("survey/api")

public class Survey_TableController {

    @Autowired
    Survey_TableRepository repository;

    @GetMapping("/surveys")
    public ResponseEntity<List<Survey_Table>> getAllSurveys() {
        try {
            List<Survey_Table> surveys = new ArrayList<>();

            surveys.addAll(repository.findAll());

            if (surveys.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(surveys, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
