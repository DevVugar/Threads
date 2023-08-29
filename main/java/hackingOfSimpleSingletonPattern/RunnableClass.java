/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackingOfSimpleSingletonPattern;

/**
 *
 * @author user
 */
public class RunnableClass implements Runnable{
   
    
    
    
    
    public RunnableClass(){}

    @Override
    public void run() {

        Singleton.getInstance();

    }










}
