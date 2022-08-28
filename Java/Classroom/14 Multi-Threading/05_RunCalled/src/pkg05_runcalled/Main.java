
package pkg05_runcalled;

// Each thread starts in a separate call stack.
// Invoking the run() method from main thread, 
// the run() method goes onto the current call stack rather than maintaining a separate call stack.

class MyThread extends Thread
{
    public MyThread(String threadName)
    {
        super(threadName);
    }
    
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("Thread Name : " +Thread.currentThread().getName() + i );
        }
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        MyThread th1 = new MyThread("Th-1");
        MyThread th2 = new MyThread("Th-2");
        
        th1.run();
        th2.run();
    }  
}
