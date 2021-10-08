package com.company.threads;

public class _Thread1 {
    public static void main(String[] args) {
        NewThread thread = new NewThread();
        Thread ranna = new Thread(new NewRunnable());
        thread.start();
        ranna.start();
    }
}

class NewThread extends Thread{
    @Override
    public void run() {
        int count = 0;
        while(count != 10){
            count++;
            System.out.println("thread: "+count);
        }
    }
}

class NewRunnable implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while(count != 10){
            count++;
            System.out.println("runnable: "+count);
        }
    }
}
