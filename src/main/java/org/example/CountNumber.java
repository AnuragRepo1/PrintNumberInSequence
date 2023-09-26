package org.example;

import com.sun.source.tree.SynchronizedTree;

public class CountNumber {
     static int n = 1;
    static  boolean  flag1 = false;
    static boolean flag2 = false;

    synchronized public  void PrintFirstThread() throws InterruptedException {
        if(flag1 == false && flag2 == false){
            System.out.println("first Thread" + n);
            flag2 = true;
            n++;
            notify();
        }else {
            wait();
        }
        if(n > 10){
            Thread.currentThread().interrupt();
        }
    }

    synchronized public void PrintSecondThread() throws InterruptedException {
        if((flag1 == false && flag2 == true)  ){
            System.out.println("second Thread" + n);
            flag1 = true;
            n++;
            notify();
        }else {
            wait();
        }
//        if(n > 10){
//            Thread.currentThread().interrupt();
//        }
    }

    synchronized public void PrintThirdThread() throws InterruptedException {
        if(flag1 == true && flag2 == true){
            System.out.println("third Thread" + n);
            flag1 = false;
            flag2 = false;
            n++;
            notify();
        }else {
            wait();
        }
//        if(n > 10){
//            Thread.currentThread().interrupt();
//        }
    }

}


