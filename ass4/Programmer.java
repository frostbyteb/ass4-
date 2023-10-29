import java.awt.*;
import java.util.ArrayList;
import java.util.List;

// Programmer class that implements the Loveable interface
public class Programmer implements Loveable {
    private BinaryString lovePower = new BinaryString("");
    private List<Observer> observers = new ArrayList<>();

    Programmer(String lovePower) {
        this.lovePower.setValue(lovePower);
        System.out.println("Hi! I am Programmer, and I have this much love: " + lovePower + " :)");
    }

    @Override
    public BinaryString getLovePower() {
        return lovePower;
    }

    // Implement the Subject interface methods
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(lovePower);
        }
    }

    // Method to set the love power and notify observers
    public void setLovePower(String lovePower) {
        this.lovePower.setValue(lovePower);
        notifyObservers();
    }
}