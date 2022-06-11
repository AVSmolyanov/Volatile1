package com.company;

public class Box {
    private static volatile boolean tumblerOn  = false;
    private static volatile boolean stopBox  = false;
    private static Box instance = null;

    private Box() {}

    public static Box get() {
        if (instance == null) instance = new Box();
        return instance;
    }

    public boolean status() {
        synchronized (this) {
            return tumblerOn;
        }
    }

    public boolean isStoped() {
        synchronized (this) {
            return stopBox;
        }
    }

    public void stop() {
        synchronized (this) {
            stopBox = true;
        }
    }

    public void on() {
        synchronized (this) {
            if (!tumblerOn) {
                tumblerOn = true;
                System.out.println(Thread.currentThread().getName() + " включил тумблер");
            }
        }
    }
    public void off() {
        synchronized (this) {
            if (tumblerOn) {
                tumblerOn = false;
                System.out.println(Thread.currentThread().getName() + " ВЫКЛЮЧИЛ тумблер");
            }
        }
    }

}
