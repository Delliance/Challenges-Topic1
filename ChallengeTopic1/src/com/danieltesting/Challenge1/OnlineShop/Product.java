package com.danieltesting.Challenge1.OnlineShop;

public interface Product {

    public void register (Observer o);
    public void unregister (Observer o);
    public void notifyObserver (Message m);


}
