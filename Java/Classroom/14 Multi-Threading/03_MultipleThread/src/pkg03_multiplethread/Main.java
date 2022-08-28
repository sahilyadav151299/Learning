 
package pkg03_multiplethread;

// start() method of Thread class is used to start a newly created thread. 
// It performs following tasks:

// A new thread starts with new callstack.
// The thread moves from New state to the Runnable state.
// When the thread gets a chance to execute, its target run() method will run

class MyThread implements Runnable
{
    public MyThread(String threadName) 
    {
        Thread th = new Thread(this, threadName);
        th.start();
    }
    
    public void run()
    {
        for(int i=1; i<=10; i++)
        System.out.println("Thread Name : " +Thread.currentThread().getName());
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        MyThread th1 = new MyThread("Thread 1");
        MyThread th2 = new MyThread("Thread 2");
    }  
}
