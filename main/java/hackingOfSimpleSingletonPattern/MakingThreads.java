/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackingOfSimpleSingletonPattern;

/**
 *
 * @author user
 */
public class MakingThreads{
    public static void main(String[] args) {
       
        
       Thread[] t=new Thread[100];
        
        for (int i = 0; i < 100; i++) {
            t[i]=new Thread(new RunnableClass());
       
            
            t[i].start();
        }       
}
}
