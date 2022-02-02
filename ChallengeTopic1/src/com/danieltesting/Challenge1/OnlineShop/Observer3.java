package com.danieltesting.Challenge1.OnlineShop;

public class Observer3 implements Observer{

    @Override
    public void update(Message m) {
        System.out.print("\nSubscriber 3: "+m.getMessageContent());
    }

}
