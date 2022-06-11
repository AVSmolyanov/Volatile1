package com.company;

public class User extends Thread {


    @Override
    public void run()
    {
        for (int i=1; i<=Const.get().getConst("Tries"); i++) {
            Box.get().on();
            try{
                Thread.currentThread().sleep(Const.get().getConst("Delay"));
            }catch(InterruptedException e){}
        }
        Box.get().stop();
    }
}



