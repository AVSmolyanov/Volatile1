package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Const.get().setConst("Delay", 300);
        Const.get().setConst("Tries", 5);

        User user = new User();
        user.setName("Пользователь");
        Toy toy = new Toy();
        toy.setName("Игрушка");
        toy.start();
        user.start();
//        user.join();
//        toy.interrupt();
  }
}
