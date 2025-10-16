package edu.ucaldas.behavior;

//ES EL SEGUNDO MANEJADOR CONCRETO PARA LA REQUEST TYPE INTERMEDIA
public class SupervisorHandler extends Handler {
    @Override
    public String handleRequest(String requestType) {
        if ("intermedia".equals(requestType)) {
            return "Atendido por Supervisor";
        } else if (next != null) {
            return next.handleRequest(requestType);
        }
        return "No se puede atender la solicitud.";
    }
}

