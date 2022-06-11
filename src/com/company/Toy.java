package com.company;

public class Toy extends Thread {
    @Override
    public void run()
    {
        while (!Thread.interrupted()&&!Box.get().isStoped()) {
            if (Box.get().status()==true) {
                Box.get().off();
            }
        }
    }
}
