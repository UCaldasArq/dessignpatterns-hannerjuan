package edu.ucaldas.structural;

//CLASE CONCRETA DE NOTIFICADOR
public class EmailNotifier implements Notifier {
    @Override
    public String send(String message) {
        return "Email enviado: " + message;
    }
}

