package com.cat.testObserver;

public interface Station {
    void addObserver(Observers observer);
    void removeObserver(Observers observer);
    void notifyObserver(String s);
}
