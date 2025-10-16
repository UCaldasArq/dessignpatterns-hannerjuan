package edu.ucaldas.behavior;

//ES EL ULTIMO MANEJADOR DE LA CADENA "AVANZADA"
public class ManagerHandler extends Handler {
    @Override
    public String handleRequest(String requestType) {
        if ("avanzada".equals(requestType)) {
            return "Atendido por Gerente";
        } else if (next != null) {
            return next.handleRequest(requestType);
        }
        return "No se puede atender la solicitud.";
    }
}
