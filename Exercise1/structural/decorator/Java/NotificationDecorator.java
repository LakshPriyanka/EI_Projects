package Exercise1.structural.decorator;
// NotificationDecorator.java
public abstract class NotificationDecorator implements Notification {
    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        notification.send(message);
    }
}