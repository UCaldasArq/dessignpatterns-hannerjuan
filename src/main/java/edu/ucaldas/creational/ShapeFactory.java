package edu.ucaldas.creational;

//fabrica de figuras
public class ShapeFactory {

    //METODO QUE DEVUELVE UNA INSTANCIA DE CIRCLE O SQUARE
    public Shape createShape(String type) {

        //NOS ASEGURAMOS QUE SI ES NULL DEVUELVA NULL
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
