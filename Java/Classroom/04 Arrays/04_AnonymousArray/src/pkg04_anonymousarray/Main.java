
package pkg04_anonymousarray;

public class Main 
{
    static void display(int A[])
    {
        for(int val : A)
            System.out.println(val);    
    }        

    public static void main(String[] args) 
    {
        display(new int[]{10,20,30,40,50});    //Passing Anonymous Array
    }
    
}
