package com.cat.testObserver;

import java.util.LinkedList;
import java.util.List;

public class StationImpl implements Station {

    List<Observers> list = new LinkedList<Observers>();

    @Override
    public void addObserver(Observers observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observers observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver(String s) {
        for (Observers a : list) {
            a.getInfo(s);
        }
    }
}
