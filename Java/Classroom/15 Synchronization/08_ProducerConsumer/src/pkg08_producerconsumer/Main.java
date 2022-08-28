
package pkg08_producerconsumer;

class SharedData
{
    private int data;
    private boolean writable = true;
    
    public synchronized void produce(int data) 
    {
        if(writable == false)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e.toString());
            }
        }    
        
        this.data = data;
        System.out.println("Produced Value : " + data);
        writable = false;
        notify();
    }
    
    public synchronized int consume() 
    {
        if(writable == true)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e.toString());
            }
        } 
        
        System.out.println("Consumed Value : " + data);
        writable = true;
        notify();
        return data;   
    }
}

class Producer extends Thread
{
    SharedData obj;
    
    public Producer(SharedData obj)
    {
        this.obj = obj;
    }
    
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            obj.produce(i);
        }    
    }
}

class Consumer extends Thread
{
    SharedData obj;
    
    public Consumer(SharedData obj)
    {
        this.obj = obj;
    }
    
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            obj.consume();
        }    
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        SharedData obj = new SharedData();
        
        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);
        
        p.start();
        c.start();
    }
}
