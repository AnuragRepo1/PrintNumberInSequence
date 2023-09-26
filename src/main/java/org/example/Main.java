package org.example;

public class Main {
    public static void main(String[] args) {

        CountNumber countNumber = new CountNumber();
        FirstThread firstThread = new FirstThread(countNumber);
        SecondThread secondThread = new SecondThread(countNumber);
        ThirdThread thirdThread = new ThirdThread(countNumber);
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}