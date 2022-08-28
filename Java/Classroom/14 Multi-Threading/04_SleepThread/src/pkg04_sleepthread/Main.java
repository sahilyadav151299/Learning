
package pkg04_sleepthread;

// The sleep() method of Thread class is used to sleep a thread for the specified amount of time.

// The prototype of sleep() are :

// public static void sleep(long miliseconds)throws InterruptedException
// public static void sleep(long miliseconds, int nanos)throws InterruptedException

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
            for(int i=1; i<=10; i++)
            {
                System.out.println("Thread Name : " +Thread.currentThread().getName());
                Thread.sleep(500);
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
    public static void main(String[] args) 
    {
        MyThread th1 = new MyThread("Th-1");
        MyThread th2 = new MyThread("Th-2");
        
        th1.start();
        th2.start();
        //th1.start();
    }  
}

// After starting a thread, it can never be started again. 
// If you does so, an IllegalThreadStateException is thrown. 
// In such case, thread will run once but for second time, it will throw exception.