package com.example.addressvalidation;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

//R 18
@Controller
public class AddressController {
    @PostMapping("/")
    public ResponseEntity<String> addNewAddress(@Valid Address address, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>("bad request", new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(null, new HttpHeaders(), HttpStatus.OK);
    }
}
