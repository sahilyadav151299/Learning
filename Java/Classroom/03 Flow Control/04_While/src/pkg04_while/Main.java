
package pkg04_while;

public class Main 
{
    public static void main(String[] args) 
    {
        int i = 1;
        
        while(true)
        {
            if(i%2==0)
                System.out.println(i);
            
            if(i == 20)
            break;
            
            i++;
        }    
    }    
}
