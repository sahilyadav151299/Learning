/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_staticsynchronizedblock;

class Table
{
    public static void printTable(int n)
    {
        try
        {
            synchronized(Table.class)
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
    public void run()
    {
       if(Thread.currentThread().getName().equals("Thread-0"))
           Table.printTable(5);
       else
           Table.printTable(10);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        
        th1.start();
        th2.start();
    }    
}
