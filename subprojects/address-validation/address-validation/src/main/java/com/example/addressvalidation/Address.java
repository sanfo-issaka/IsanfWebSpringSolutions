package com.example.addressvalidation;

import javax.validation.constraints.NotNull;

//R 18
public class Address {
    @NotNull
    private String line1;
    
    private String line2;

    // getters and setters
    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}
    
}
