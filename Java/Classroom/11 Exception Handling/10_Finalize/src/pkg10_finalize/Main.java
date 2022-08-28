
package pkg10_finalize;

// The finalize() method of Object class is a method that 
// the Garbage Collector always calls just before the deletion/destroying 
// the object which is eligible for Garbage Collection, 
// so as to perform clean-up activity.

class FinalizeDemo
{
    public void finalize()
    {
        System.out.println("Finalize Method Called");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        FinalizeDemo f1 = new FinalizeDemo();
        FinalizeDemo f2 = new FinalizeDemo();
        
        f1 = null;
        f2 = null;
        
        System.gc();
    }
}

