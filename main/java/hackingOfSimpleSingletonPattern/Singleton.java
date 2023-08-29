/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackingOfSimpleSingletonPattern;

/**
 *
 * @author user
 */
    
public class Singleton
{
    private static Singleton obj;
 
  
    private Singleton() {
        System.out.println("hello");
    
    }
     //synchronized 
     public static Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
}


