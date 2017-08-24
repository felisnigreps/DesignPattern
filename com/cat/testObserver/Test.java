package com.cat.testObserver;

import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        Station station = new StationImpl();
        station.addObserver(new ObserversImpl());
        station.addObserver(new ObserversImpl());
        station.addObserver(new ObserversImpl());
        station.addObserver(new ObserversImpl());
        station.notifyObserver("come on");
    }
}
