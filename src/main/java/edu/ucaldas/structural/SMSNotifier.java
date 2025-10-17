package edu.ucaldas.structural;

//CLASE CONCRETA DE NOTIFICADOR DE SMS
public class SMSNotifier extends NotifierDecorator {

    //CONSTRUCTOR
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        // 1. Llama al metodo del objeto envuelto(emailnotifier)
        String emailResult = super.send(message);

        //2. agrega su propio comportamiento
        return "SMS enviado: " + message + " | " + emailResult;
    }
}
