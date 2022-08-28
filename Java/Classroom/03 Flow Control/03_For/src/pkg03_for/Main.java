
package pkg03_for;

public class Main 
{
    public static void main(String[] args) 
    {
        // 1) For Loop
        
        int num = 5;
        
        for(int i=1; i<=10; i++)
        {
            int res = num * i;
            System.out.println(num+" x "+i+" = "+res);   // Prints Table 
        }     
        
        
        // 2) For Each or Enhanced For Loop
        
        int A[] = {10,20,30,40,50};
        
        for(int val: A)
        {
            System.out.println(val);
        }   
        
        
        // 3) Nested For Loop
        
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j<=5; j++)
            {
                System.out.print("*");
            }
            
            System.out.println("");
        }    
        
        // 4) Labelled For Loop
        
        outer: 
        for(int i=1; i<=5; i++)
        {
            inner:
            for(int j=1; j<=5; j++)
            {
                if(i==2)
                break inner;
                
                if(i==4)
                break outer;
                
                System.out.print(i*j);        
            }  
            
            System.out.println("");
        }
        
    }    
}
