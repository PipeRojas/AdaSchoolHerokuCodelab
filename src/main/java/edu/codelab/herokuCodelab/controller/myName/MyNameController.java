package edu.codelab.herokuCodelab.controller.myName;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/myName")
public class MyNameController {

    @GetMapping
    public ResponseEntity<String> myName(){return ResponseEntity.ok("Andrés Felipe");}
}
