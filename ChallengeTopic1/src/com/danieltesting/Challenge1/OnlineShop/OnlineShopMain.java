package com.danieltesting.Challenge1.OnlineShop;

public class OnlineShopMain {

    public static void onlineShopMain(){

//        Creating the products
        ProductOne productOne = new ProductOne();
        ProductTwo productTwo = new ProductTwo();
        ProductThree productThree = new ProductThree();

//        Creating the new observers/users
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Observer3 observer3 = new Observer3();

//        Registering all the users to product 1
        productOne.register(observer1);
        productOne.register(observer2);
        productOne.register(observer3);

//        Registering only user 2 and 3 to product 2
        productTwo.register(observer2);
        productTwo.register(observer3);

//        Registering only user 2 to product 3
        productThree.register(observer2);

        System.out.println("Initial price for all the products");
        productOne.notifyObserver(new Message(150));
        productTwo.notifyObserver(new Message(75));
        productThree.notifyObserver(new Message(136));

        System.out.println("\nUnsubscribing user 2 from all, and subscribing user 3 to product 3");
        productOne.unregister(observer2);
        productTwo.unregister(observer2);
        productThree.unregister(observer2);

        productThree.register(observer3);

        System.out.println("\nChange of price");
        productOne.notifyObserver(new Message(145));
        productTwo.notifyObserver(new Message(80));
        productThree.notifyObserver(new Message(272));

    }

}
