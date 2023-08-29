/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author user
 */
public class ExecutorServicee {

    public static void main(String[] args) throws InterruptedException {
        SingleThreadExecutor2();
    }

    
    
    
    //********************************************************************************************

   
    
    
    
    
    
    
    
    
    public static void SingleThreadExecutor() throws InterruptedException {
        //Threads one by one into the runnable method

        ExecutorService service = Executors.newSingleThreadExecutor();

        service.submit(new MyRunnable("Murad"));
        service.submit(new MyRunnable("Orxan"));
        service.submit(new MyRunnable("Ali"));
        service.submit(new MyRunnable("Vasif"));
        service.submit(new MyRunnable("Fikret"));
        service.submit(new MyRunnable("Veli"));
        service.submit(new MyRunnable("Aslan"));
        service.submit(new MyRunnable("Vandijk"));
 
        service.shutdown();
    
        service.awaitTermination(40, TimeUnit.SECONDS);     //AwaitTermination runs when all threads have finished their work,
        System.out.println("awaitTermination");             //or if all the threads are not finished yet, so AwaitTermination waits a few seconds what we give, and it starts
   
     }

    
    //********************************************************************************************
    
    
    
    
    
    
    
    
    
    
 public static void FixedThreadPool() throws InterruptedException {
 //It only created 5 threads, first 5 threads ran 5 runnable methods, after it did  other.
        
ExecutorService service =Executors.newFixedThreadPool(5); //count of threads
  
        service.submit(new MyRunnable("Murad"));
        service.submit(new MyRunnable("Orxan"));
        service.submit(new MyRunnable("Ali"));
        service.submit(new MyRunnable("Vasif"));
        service.submit(new MyRunnable("Fikret"));
        service.submit(new MyRunnable("Veli"));
        service.submit(new MyRunnable("Aslan"));
        service.submit(new MyRunnable("Vandijk"));
 
        service.shutdown();
        
    
 }

     //********************************************************************************************

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    public static void CachedThreadPool() throws InterruptedException {
        ExecutorService service=new ThreadPoolExecutor(10, 15,                 //count of threads(pool size) , if isn't enough it extends count of threads to max size(max pool size)
                                      5, TimeUnit.SECONDS,                     //AliveTime
                                      new SynchronousQueue<Runnable>());       //workQueue
        
        
         service.submit(new MyRunnable("Murad"));
        service.submit(new MyRunnable("Orxan"));
        service.submit(new MyRunnable("Ali"));
        service.submit(new MyRunnable("Vasif"));
        service.submit(new MyRunnable("Fikret"));
        service.submit(new MyRunnable("Veli"));
        service.submit(new MyRunnable("Aslan"));
        service.submit(new MyRunnable("Vandijk"));
        
       // ExecutorService service2=Executors.newCachedThreadPool(new MyThreadFactory());
    
    
       service.shutdown();
       
        service.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("awaitTermination");
 
       
    }
    
    







//********************************************************************************************

    
 
    
    //with Callable
     public static void SingleThreadExecutor2() throws InterruptedException {
        //Threads one by one into the runnable method

        ExecutorService service = Executors.newSingleThreadExecutor();

   MyCallable[] arr=new MyCallable[3];
   arr[0]=new MyCallable("Murad");
   arr[1]=new MyCallable("Orxan");
   arr[2]=new MyCallable("Vandijk");

    List<Future<Object>> list = service.invokeAll(Arrays.asList(arr));   //invakeAny is better for performance
    //......
    
    Future f=list.get(0);
    
      service.shutdown();
     }





}
