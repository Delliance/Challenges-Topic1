package com.danieltesting.Challenge1.OnlineShop;

public class Observer1 implements Observer{

    @Override
    public void update(Message m) {
        System.out.print("\nSubscriber 1: "+m.getMessageContent());
    }

}
