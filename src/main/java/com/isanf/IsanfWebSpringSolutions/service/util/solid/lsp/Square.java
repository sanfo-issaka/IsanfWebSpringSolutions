package com.isanf.IsanfWebSpringSolutions.service.util.solid.lsp;

public class Square extends Shape {
    private double side;

    @Override
    public double area() {
        return side * side;
    }
}
