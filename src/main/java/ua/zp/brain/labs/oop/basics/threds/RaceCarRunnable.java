package ua.zp.brain.labs.oop.basics.threds;

import java.util.concurrent.ThreadLocalRandom;

public class RaceCarRunnable extends Car implements Runnable{
    private int passed;
    private int distance;
    private boolean isFinish;

    public RaceCarRunnable(String name, int speed, int distance) {
        super(name, speed);
        this.distance = distance;
    }
    public int getRandomSpeed(){
        return ThreadLocalRandom.current().nextInt(10,50);
    }

    @Override
    public void run(){
        while (!isFinish){
            int currentSpeed=getRandomSpeed();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            passed+=(currentSpeed*100/3600);
            System.out.println(getName()+" => speed:"+currentSpeed+
                    " ; progress: "+passed+"/"+distance);
            if(passed>=distance){
                isFinish=true;
            }
        }

    }
}
