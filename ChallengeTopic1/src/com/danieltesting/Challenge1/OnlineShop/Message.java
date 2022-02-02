package com.danieltesting.Challenge1.OnlineShop;

import java.text.NumberFormat;

public class Message {
    final String messageContent;

    public Message(double m){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        this.messageContent = "\nChange of price: "+ formatter.format(m);
    }

    public String getMessageContent(){
        return messageContent;
    }
}
