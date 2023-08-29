/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main.threads;

import main.threads.Base;
import main.threads.MyRunnable;

/**
 *
 * @author user
 */
public class main {

    public static void main(String[] args) throws InterruptedException {

        
           Thread[] m = new Thread[100];
           
        for (int i = 0; i < 100; i++) {
            m[i]=new Thread(new MyRunnable("Name"));
     m[i].start();
        
        }
           Thread.sleep(4000);
           
        System.out.println(Base.getA());
    

    }
}
