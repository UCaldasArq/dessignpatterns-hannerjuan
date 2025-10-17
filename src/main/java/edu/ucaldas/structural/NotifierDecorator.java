package edu.ucaldas.structural;

//CLASE ABSTRACTA DE NOTIFICADOR Y BASE DE LOS DECORADORES
public abstract class NotifierDecorator implements Notifier {

    // El objeto que será "envuelto"
    protected Notifier wrappee;

    public NotifierDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public String send(String message) {
        // Delega la llamada al objeto envuelto
        return wrappee.send(message);
    }
}
