package org.example;

public class ThirdThread extends Thread{
    CountNumber countNumber;
    ThirdThread(CountNumber countNumber){
        this.countNumber = countNumber;
    }
    public void run(){
        try {
            while (true) {
                this.countNumber.PrintThirdThread();

                Thread.sleep(200);
            }
        }catch (InterruptedException e){

        }
    }
}
