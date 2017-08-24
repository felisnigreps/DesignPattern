package com.cat.testObserver;

public class ObserversImpl implements Observers {
    @Override
    public void getInfo(String s) {
        System.out.println(s);
    }
}
