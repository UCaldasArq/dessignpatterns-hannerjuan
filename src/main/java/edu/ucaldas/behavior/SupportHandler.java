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
