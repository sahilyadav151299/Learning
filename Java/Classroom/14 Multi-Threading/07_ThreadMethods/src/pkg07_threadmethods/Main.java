
package pkg07_threadmethods;

class MyThread extends Thread
{
    public void run()
    {
        for(int i=0; i<=5; i++)
            System.out.println("Thread Name : " +Thread.currentThread().getName());
    }
}

public class Main 
{
    public static void main(String[] args) throws InterruptedException 
    {
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        
        System.out.println(th1.getName() +" "+ th1.getId() +" "+ th1.getPriority() +" "+ th1.getState());
        System.out.println(th2.getName() +" "+ th2.getId() +" "+ th2.getPriority() +" "+ th2.getState());
        
        th1.start();
   
        th2.setName("Th-1");
        th2.start();
        
        th1.join();
        th2.join();
        
        System.out.println(th1.getName() +" "+ th1.getId() +" "+ th1.getPriority() +" "+ th1.getState());
        System.out.println(th2.getName() +" "+ th2.getId() +" "+ th2.getPriority() +" "+ th2.getState());
       
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
    }  
}
