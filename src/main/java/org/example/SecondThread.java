package org.example;

public class SecondThread extends Thread{
    CountNumber countNumber;
    SecondThread(CountNumber countNumber){
        this.countNumber = countNumber;
    }
    public void run(){
        try {
            while(true) {
                this.countNumber.PrintSecondThread();
                Thread.sleep(200);
            }
        }catch (InterruptedException e){

        }
    }
}
