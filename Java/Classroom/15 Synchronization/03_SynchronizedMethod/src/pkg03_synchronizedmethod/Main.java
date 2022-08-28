
package pkg03_synchronizedmethod;

// If you declare any method as synchronized, it is known as synchronized method.
// Synchronized method is used to lock an object for any shared resource.
// When a thread invokes a synchronized method, it automatically acquires the lock for that object 
// & releases it when the thread completes its task.

class Table
{
    public synchronized void printTable(int n)
    {
        try
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println(n + "x" +i+ "=" + n*i);
                Thread.sleep(400);
            }    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class MyThread extends Thread
{
    Table obj;
    
    public MyThread(Table obj)
    {
        this.obj = obj;
    }
    
    public void run()
    {
       if(Thread.currentThread().getName().equals("Thread-0"))
           obj.printTable(5);
       else
           obj.printTable(10);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Table obj = new Table();
        
        MyThread th1 = new MyThread(obj);
        MyThread th2 = new MyThread(obj);
        
        th1.start();
        th2.start();
    }    
}

