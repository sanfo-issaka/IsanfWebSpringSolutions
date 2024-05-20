package com.isanf.IsanfWebCRUDSolutions.service.util.solid.lsp;

public class Rectangle extends Shape {
    private double width;
    private double height;

    @Override
    public double area() {
        return width * height;
    }
}
