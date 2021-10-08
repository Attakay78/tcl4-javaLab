package com.company.threads;

import java.util.Scanner;

public class _Thread {
    static  int counter = 0;
    public static void main(String[] args) {

        Thread counterThread = new Thread(() -> {
                try {
                    while(true){
                        counter ++;
                        System.out.println(counter);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
        });
        counterThread.start();

        Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();
        counterThread.interrupt();
    }
}
