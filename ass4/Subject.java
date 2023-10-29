

// Subject interface for the Observer pattern
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Observer interface for the Observer pattern
interface Observer {
    void update(BinaryString lovePower);
}