package com.danieltesting.Challenge1.OnlineShop;

public class Observer2 implements Observer{

    @Override
    public void update(Message m) {
        System.out.print("\nSubscriber 2: "+m.getMessageContent());
    }

}
