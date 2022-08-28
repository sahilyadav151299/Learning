
package pkg01_basic;

/* 
                                      ** Multithreading & Thread **

Multithreading is a process of executing multiple threads simultaneously.

A thread is a lightweight sub-process & the smallest execution unit. 

Java Multithreading is mostly used in games, animation, etc.




                                  ** Advantages of Java Multithreading ** 

1) It makes the program more responsive & more interactive 
   i.e. user can interact with multiple portion of a program simultaneously.

2) It utilizes CPU ideal time which occurs between IO operations. Hence program becomes more efficient.

3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.




                                            ** Multitasking **

Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. 

Multitasking can be achieved in two ways:

A) Process-based Multitasking (Multiprocessing)

1) Each process has an address in memory. In other words, each process allocates a separate memory area.
2) A process is heavyweight.
3) Cost of communication between the process is high.
4) Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.

B) Thread-based Multitasking (Multithreading)

1) Threads share the same address space.
2) A thread is lightweight.
3) Cost of communication between the thread is low.

We use multithreading than multiprocessing because threads use a shared memory area. 
They don't allocate separate memory area so saves memory, and 
context-switching between the threads takes less time than process.




                                   **Life cycle of a Thread (Thread States)**

The life cycle of the thread in java is controlled by JVM.
The scheduling of thread over CPU is totallay taken care by the OS. 

1) New        : An instance of Thread class is created but before the invocation of start() method.
2) Runnable   : The thread is in runnable state after invocation of start() method, 
                but the thread scheduler has not selected it to be the running thread.
                ( start() place thread in thread pool & waits for CPU ).    
3) Running    : The thread is in running state if the thread scheduler has selected it ( run() called ).  
4) Blocked    : This is the state when the thread is still alive, but is currently not eligible to run. 
5) Terminated : A thread is in terminated or dead state when its run() method exits.


*/