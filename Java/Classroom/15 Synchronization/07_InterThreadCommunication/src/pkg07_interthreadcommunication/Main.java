
package pkg07_interthreadcommunication;

/*

Inter-thread communication or Co-operation is all about allowing 
synchronized threads to communicate with each other.

Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running 
in its critical section and another thread is allowed to enter (or lock) in the same critical 
section to be executed.

It is implemented by following methods of Object class:

1) wait(), 

Whenever a thread calls wait(), It causes current thread to release the monitor & make object free. 
And comes into waiting state and wait until either another thread notify it by invoking the notify() 
or notifyAll() method.

public final void wait() throws InterruptedException
public final void wait(long timeout) throws InterruptedException


2) notify(),    

Whenever a thread calls the notify(), then this method will change the state of any one thread from
waiting to runnable state. Which thread to be choosen among n threads is totally depends on OS.

public final void notify()


3) notifiAll(),

Whenever a thread calls the notify(), then this method will change the state of all threads from
waiting to runnable state.

public final void notifyAll()


These all must be used within a synchronized block/method only.
Otherwise JVM generates Exception.

The thread which called wait() also releases the monitor but
The thread which called notify()/notifyAll() doesn't release monitor & continue its execution after notifying.
*/

import java.util.Scanner;

class Customer
{  
    int amount=10000;  

    synchronized void withdraw(int amount)
    {  
        System.out.println("going to withdraw...");  

        if(this.amount<amount)
        {  
            System.out.println("Less Balance, Waiting For Deposit");  
            try
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }  
        }  
        
        this.amount = this.amount - amount;  
        System.out.println("Withdraw Completed");  
    }  

    synchronized void deposit(int amount)
    {  
        System.out.println("Going To Deposit");  
        this.amount = this.amount + amount;  
        System.out.println("Deposit Completed");  
        notify();  
    }  
}

public class Main 
{
    public static void main(String[] args)
    {
        final Customer c=new Customer();  
        
        new Thread()
        {  
            public void run()
            {
                c.withdraw(15000);
            }  
        }.start(); 

        new Thread()
        {  
            public void run()
            {
                c.deposit(15000);
            }  
        }.start();
    }
}

