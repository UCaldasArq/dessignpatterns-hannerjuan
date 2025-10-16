package edu.ucaldas.behavior;

//ES EL PRIMER MANEJADOR CONCRETO DE LA CADENA (BASICO)
public class BasicSupportHandler extends Handler {
    @Override

    //COMPRUEBA SI EL REQUESTYPE ES "BASICA"
    public String handleRequest(String requestType) {
        if ("básica".equals(requestType)) {
            return "Atendido por Soporte Básico";
        } else if (next != null) {
            return next.handleRequest(requestType);
        }
        return "No se puede atender la solicitud.";
    }
}
