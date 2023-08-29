/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.threads;

import java.util.concurrent.Callable;

/**
 *
 * @author user
 */
public class MyCallable implements Callable<Object>{
       private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    
    
    @Override
    public Object call() {
     doIt();
     return this;
    
    }
    
    
    public void doIt(){
    
       try {
       Thread.sleep(3000);
 
       } catch (InterruptedException ex) {
   
       }

        Base.increaseA();
        int a = Base.getA();
        System.out.println(a + " Person's name is " + name);

    
    }
}


