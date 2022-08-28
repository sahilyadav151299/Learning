
package pkg01_basicones;


/*
                        ** Synchronization in Java **

Synchronization is the capability to control the access of multiple threads to any shared resource.

Synchronization is used to overcome the problem of race condition.


                            ** Critical Section **

When a variable/resource/segment of the program is executed by multiple threads simultaneously. 
Then this program variable/resource/segment is called as critical section.

It necessary to control the access to a critical section in order to get desired & consistent output.
So only one thread can execute the critical section at a time.


                        ** Why use Synchronization **
                        
1) To prevent thread interference
2) To prevent consistency problem


                        ** Types of Synchronization **

1) Process Synchronization
2) Thread Synchronization,
   Co-operating & controlling of the access to a critical section by the multiple thread is called as TS.


                    ** Types of Thread Synchronization **

A) Mutual Exclusive Synchronization, 
   Mutual Exclusive helps keep threads from interfering with one another while sharing data 

                                        1) Synchronized method
                                        2) Synchronized block
                                        3) static synchronization

B) Cooperation or Conditional Synchronization
   (Inter-thread communication in java)


                            ** Concept of Lock **   

Synchronization is built around an internal entity known as the lock or monitor. 
Every object has an lock associated with it. 

By convention, a thread that needs consistent access to an object's fields has to acquire the object's lock 
before accessing them, and then release the lock when it's done with them.

From Java 5 the package java.util.concurrent.locks contains several lock implementations.

A thread iff can enter within a synchronized block if ita has the monitor of a calling object.
It a thread uses a object to call a synchronized method then Java check thread has the monitor
of calling object or not.

Each object has only one monitor so if a thread very first enters into the synchronized block,
it acquires the lock. 

Now if second thread using the same object wants to call a synchronized method then Java checks
thread has monitor or not. Here first thread already has monitor of the object so Java pushes the
second thread into the waiting state.

But if the object is locked by first thread, second thread can use the same object to call the 
non-synchronized(static/non-static) method. Because in this cse Java doesn't check whether thread
has monitor or not.


                        ** Synchronized modifier **

To achieve the synchronization among the threads, Java provides "synchronized" modifier. 

This modifier can only applicable for methods.
A class or variable can't become synchronized. 

*/