package edu.ucaldas.behavior;

//CLASE ABSTRACTA DE TODOS LOS MANEJADORES
public abstract class Handler {

    //SI NO PUEDE PROCESAR LA SOLICITUD SE LA PASA A ESTE
    protected Handler next;

    //METODO PARA DECIDIR CUAL MANEJADOR SIGUE EN LA CADENA
    public void setNext(Handler next) {
        this.next = next;
    }
    //METODO ABSTRACTO QUE CADA MANEJADOR EN CONCRETO DEBE IMPLEMENTAR
    public abstract String handleRequest(String requestType);
}
