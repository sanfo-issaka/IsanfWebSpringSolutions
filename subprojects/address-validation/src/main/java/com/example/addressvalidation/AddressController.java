package com.example.addressvalidation;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

//R 21
@Controller
public class AddressController {
    @PostMapping("/")
    public ResponseEntity<String> addNewAddress(@Valid @RequestBody Address address, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>("bad request", new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(address.getLine1(), new HttpHeaders(), HttpStatus.OK);
    }
}
