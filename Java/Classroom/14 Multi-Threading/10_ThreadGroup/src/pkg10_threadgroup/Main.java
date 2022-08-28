
package pkg10_threadgroup;

// Java thread group is implemented by java.lang.ThreadGroup class.
// A ThreadGroup represents a set of threads. 
// A thread group can also include the other thread group. 
// The thread group creates a tree in which every thread group except the initial thread group has a parent.

// Java provides a convenient way to group multiple threads in a single object. 
// In such way, we can suspend, resume or interrupt group of threads by a single method call.

// A thread is allowed to access information about its own thread group, 
// but it cannot access the information about its thread group's parent thread group or any other thread groups

class MyThreadGroup implements Runnable
{
    public void run()
    {
        System.out.println("Thread Name : " +Thread.currentThread().getName());
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        MyThreadGroup runnable = new MyThreadGroup();
        
        ThreadGroup tg1 = new ThreadGroup("Parent Thread");
        
        Thread th1 = new Thread(tg1,runnable,"Th-1");
        th1.start();
        
        Thread th2 = new Thread(tg1,runnable,"Th-2");
        th2.start();
        
        Thread th3 = new Thread(tg1,runnable,"Th-3");
        th3.start();
        
        System.out.println("Thread Group : " +tg1.getName());
        
        tg1.list();
    }    
}
