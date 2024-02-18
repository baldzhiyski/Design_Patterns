package example.platform;

import example.observers.Observer;
import example.observers.User;

import java.util.ArrayList;
import java.util.List;

public class Group implements  Subject {
    private List<Observer> observers = new ArrayList<>();//subscriber/observer list
    private String post;
    private String name;

    public Group(String name) {
        this.name = name;
    }

    public void publishPost(String post) {
        this.post = post;
        notifyObserver();
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.getPost());
        }
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public User getObserverByName(String name) {
        return (User) observers.stream()
                .filter(observer -> observer.getName().equals(name))
                .findFirst()
                .get();
    }
}
