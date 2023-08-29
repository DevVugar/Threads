/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.threads;

/**
 *
 * @author user
 */
public class MyRunnable implements Runnable {

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    
    
    @Override
    public synchronized void run() {

     try {
       Thread.sleep(3000);
    } catch (InterruptedException ex) {
  
    }

        Base.increaseA();
        int a = Base.getA();
        System.out.println(a + " Person's name is " + name);

    }
}
