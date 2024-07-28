package Exercise1.structural.decorator;
public class BasicNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending notification: " + message);
    }
}