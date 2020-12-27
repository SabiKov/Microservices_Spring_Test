package hu.sabi.microservice1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonDocumentController {

    @RequestMapping("/docet")
    public ResponseEntity<Void> personalDocumentHandler() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
