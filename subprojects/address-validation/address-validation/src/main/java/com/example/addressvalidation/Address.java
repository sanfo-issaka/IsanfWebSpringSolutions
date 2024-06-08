package com.example.addressvalidation;

import javax.validation.constraints.NotNull;

public class Address {
    @NotNull
    private String line1;

    // getters and setters
    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }
}
