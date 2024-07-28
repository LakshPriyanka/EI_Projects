package Exercise1.behavioural.observer;
public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();

        Observer subscriber1 = new Subscriber("Alice");
        Observer subscriber2 = new Subscriber("Bob");

        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);

        publisher.publishNews("New article on Design Patterns released!");

        publisher.removeSubscriber(subscriber1);

        publisher.publishNews("Observer Pattern Explained with Java Example!");
    }
}
