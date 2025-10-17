package edu.ucaldas.creational;

//CLASE CONCRETA CUADRADO QUE IMPLEMENTA UNA INTERFAZ DE TIPO SHAPE
public class Square implements Shape {
    @Override
    public String draw() {
        return "Dibujando un cuadrado.";
    }
}
