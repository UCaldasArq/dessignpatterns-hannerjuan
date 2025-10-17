package edu.ucaldas.creational;

//CLASE CONCRETA CIRCLE QUE IMPLEMENTA UNA INTERFAZ DE TIPO SHAPE
public class Circle implements Shape {
    @Override
    public String draw() {
        return "Dibujando un círculo.";
    }
}
