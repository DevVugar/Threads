/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.threads;

import java.util.concurrent.ThreadFactory;

/**
 *
 * @author user
 */
public class MyThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
    
    if (r instanceof MyRunnable){
    Thread t=new Thread(r);
     t.setDaemon(true);
    return  t;
    }
     
    
    else if(r instanceof MyRunnable2){
            
      Thread t=new Thread(r);
      t.setDaemon(false);
      return t;
      }
    
    return null;
            
    }
    
}
