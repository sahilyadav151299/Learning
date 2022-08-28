
package pkg04_synchronizedblock;

// Synchronized block can be used to perform synchronization on any specific resource of the method.
// Suppose you have 50 lines of code in your method, but you want to synchronize only 5 lines, 
// you can use synchronized block.
// If you put all the codes of the method in the synchronized block, 
// it will work same as the synchronized method.

class Table
{
    public void printTable(int n)
    {
        try
        {
            synchronized(this)
            {
                for(int i=1; i<=10; i++)
                {
                    System.out.println(n + "x" +i+ "=" + n*i);
                    Thread.sleep(400);
                } 
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

