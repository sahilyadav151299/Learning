
package pkg07_continue;

public class Main 
{
    public static void main(String[] args) 
    {
        // 1) Continue Statement
        
        int age[] = {10,11,12,14,15,15,18,18,18,19,20};
        
        for(int i=0; i<age.length; i++)
        {
            if(age[i] < 18)
                continue;
            else
                System.out.println("Adult Age : " +age[i]);    
        }    
                
        
        // 2) Labelled Continue
        
        outer:  
        for(int idx=1; idx<=3; idx++)
        {    
            inner:
            for(int jdx=1; jdx<=3; jdx++)
            {    
                if(idx==2 && jdx==2)  
                continue outer;    
               
                System.out.println(idx+" "+jdx);    
            }     
        }
    }   
}
