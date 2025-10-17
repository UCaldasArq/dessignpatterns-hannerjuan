package edu.ucaldas.creational;

//CLASE CONCRETA CUADRADO QUE IMPLEMENTA UNA INTERFAZ DE TIPO forma
public class Square implements Shape {
    @Override
    public String draw() {
        return "Dibujando un cuadrado.";
    }
}
