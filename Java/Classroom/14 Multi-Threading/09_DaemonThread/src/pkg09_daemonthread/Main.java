
package pkg09_daemonthread;

// It provides services to user threads for background supporting tasks. 
// Its life depend on the mercy of user threads 
// i.e. when all the user threads dies, JVM terminates this thread automatically.
// Its life depends on user threads.
// It is a low priority thread.
// There are many java daemon threads running automatically e.g. gc, finalizer etc.
// If you want to make a user thread as Daemon, it must not be started 
// otherwise it will throw IllegalThreadStateException.
// Make your thread as Daemon before call of start()

class DaemonThread extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Deamon Thread Is Running");
            System.out.println("Name     : " +Thread.currentThread().getName());
            System.out.println("Priority : " +Thread.currentThread().getPriority());
        }
        else
        {
            System.out.println("User Thread Is Running");
            System.out.println("Name     : " +Thread.currentThread().getName());
            System.out.println("Priority : " +Thread.currentThread().getPriority());
        }
    }
}

public class Main 
{
    public static void main(String[] args) throws InterruptedException 
    {   
        DaemonThread th1 = new DaemonThread();
        DaemonThread th2 = new DaemonThread();
        DaemonThread th3 = new DaemonThread();
        
        th1.setDaemon(true);         // Set true before start() called   
        
        th1.start();    th1.join();
        th2.start();    th2.join();
        th3.start();    th3.join();
    }  
}
