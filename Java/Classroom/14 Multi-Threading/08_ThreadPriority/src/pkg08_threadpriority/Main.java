
package pkg08_threadpriority;

// Each thread have a priority. 
// Priorities are represented by a number between 1 and 10. 
// In most cases, thread schedular schedules the threads according to their priority (known as preemptive scheduling).
// But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.

// 3 constants defined in Thread class:

// public static int MIN_PRIORITY   : Default value 1
// public static int NORM_PRIORITY  : Default value 5
// public static int MAX_PRIORITY   : Default value 10

class MyThread extends Thread
{
    public MyThread(String threadName)
    {
        super(threadName);
    }
    
    public void run()
    {
        System.out.println("Thread Name     : " + Thread.currentThread().getName());
        System.out.println("Default Priority : " + Thread.currentThread().getPriority());
    }
}

public class Main 
{
    public static void main(String[] args) throws InterruptedException 
    {
        MyThread th1 = new MyThread("Th-1");
        MyThread th2 = new MyThread("Th-2");
        MyThread th3 = new MyThread("Th-3");
        
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MAX_PRIORITY);
        
        th1.start();
        th2.start();
        th3.start();
    }  
}
