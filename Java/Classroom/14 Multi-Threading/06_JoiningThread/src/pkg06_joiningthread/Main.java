
package pkg06_joiningthread;

// join() causes the currently running threads to stop executing 
// until the thread it joins with, completes its task.

// public void join()throws InterruptedException
// public void join(long milliseconds)throws InterruptedException

class MyThread extends Thread
{
    public MyThread(String threadName)
    {
        super(threadName);
    }
    
    public void run()
    {
        try
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println("Thread Name : " +Thread.currentThread().getName());
                Thread.sleep(400);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.toString());
        }
    }
}

public class Main 
{
    public static void main(String[] args) throws InterruptedException 
    {
        MyThread th1 = new MyThread("Th-1");
        MyThread th2 = new MyThread("Th-2");
        MyThread th3 = new MyThread("Th-3");
        
        th1.start();        // Th-1 in thread pool
        th1.join();         // Main paused, Th-1 completes its execution
                            // Main starts
        th2.start();        // Th-2 in thread pool
        th2.join();         // Main paused, Th-2 completes its execution
                            // Main starts
        th3.start();        // Main & Th-3 in thread pool fights for CPU
        
        
        for(int i=1; i<=5; i++)
        {
            System.out.println("Thread Name : " +Thread.currentThread().getName());
            Thread.sleep(400);   
        }    
    }  
}
