
package pkg02_threadcreation;

import java.lang.Thread;

// 1) By extending Thread class

// Thread class provide constructors and methods to create and perform operations on a thread.
// Thread class extends Object class and implements Runnable interface.

class MyThreadOne extends Thread
{
    public void run()
    {
        System.out.println("MyThreadOne Extends Thread");
    }
}

// 2) By implementing Runnable interface.
// Runable interface contains only run() method.
// The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.


class MyThreadtwo implements Runnable
{
    public void run()
    {
        System.out.println("MyThreadTwo Implements Runnable");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {   
        MyThreadOne th1 = new MyThreadOne();
        th1.start();
        
        MyThreadtwo obj = new MyThreadtwo();
        Thread th2 = new Thread(obj);
        th2.start();
    }  
}
