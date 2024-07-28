package Exercise1.behavioural.observer;
import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>();

    public void addSubscriber(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String news) {
        for (Observer subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("Publishing News: " + news);
        notifySubscribers(news);
    }
}
