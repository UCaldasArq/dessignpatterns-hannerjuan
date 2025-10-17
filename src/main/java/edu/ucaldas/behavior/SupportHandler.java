package edu.ucaldas.behavior;
//CONSTRUCTOR DE LA CADENA
public class SupportHandler {

    //CREA LOS OBJETOS MANEJADORES
    public static Handler createChain() {
        // Crea la cadena: Basic → Supervisor → Manager
        Handler basic = new BasicSupportHandler();
        Handler supervisor = new SupervisorHandler();
        Handler manager = new ManagerHandler();


        //SE ENLAZAN CON EL METODO SETNEXT
        basic.setNext(supervisor);
        supervisor.setNext(manager);

        //DEVUELVE EL PRIMER MANEJADOR BASICO O EL PRIMER ESLABON
        return basic;
    }
}

// TODO: Implementa el patrón Chain of Responsibility.
// Crea tres manejadores concretos:
// 1. BasicSupportHandler → maneja solicitudes "básicas"
// 2. SupervisorHandler → maneja solicitudes "intermedias"
// 3. ManagerHandler → maneja solicitudes "avanzadas"
// Si no puede manejar, debe pasar al siguiente en la cadena.