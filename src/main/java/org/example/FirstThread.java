package org.example;

public class FirstThread extends Thread{
    CountNumber countNumber;
    FirstThread(CountNumber countNumber){
        this.countNumber = countNumber;
    }
    public void run(){
        try {
            while(true) {
                this.countNumber.PrintFirstThread();
                Thread.sleep(200);
            }
        }catch (InterruptedException e){

        }
    }
}
