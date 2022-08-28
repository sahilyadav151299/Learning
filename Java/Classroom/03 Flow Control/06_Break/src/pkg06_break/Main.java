
package pkg06_break;

public class Main 
{
    public static void main(String[] args) 
    {
        // 1) Break Statement
        
        int age[] = {20,19,18,17,16,15};
        int i = 0;
        
        while(true)
        {
            if(age[i] < 18)
                break;
            else
                System.out.println("Voter Age "+age[i]);  
            
            i++;
        }  
        
        
        // 2) Labelled Break
        
        outer:  
        for(int idx=1; idx<=3; idx++)
        {    
            inner:
            for(int jdx=1; jdx<=3; jdx++)
            {    
                if(idx==2 && jdx==2)  
                break outer;    
               
                System.out.println(idx+" "+jdx);    
            }     
        }         
    }    
}
