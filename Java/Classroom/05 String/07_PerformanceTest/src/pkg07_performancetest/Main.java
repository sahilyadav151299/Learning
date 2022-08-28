
package pkg07_performancetest;

public class Main 
{
    public static void concateString()
    {
        String st = "Java";
        
        for(int i=1; i<=10000; i++)
        st = st + "Class";    
    }
    
    public static void concateStringBuffer()
    {
        StringBuffer st = new StringBuffer("Java");
        
        for(int i=1; i<=10000; i++)
        st.append("Class");    
    }
    
    public static void concateStringBuilder()
    {
        StringBuilder st = new StringBuilder("Java");
        
        for(int i=1; i<=10000; i++)
        st.append("Class");
    }
    
    public static void main(String[] args) 
    {
        long startTime = System.currentTimeMillis();
        
        concateString();
        
        System.out.println("String : "+(System.currentTimeMillis() - startTime));
        
        
        startTime = System.currentTimeMillis();
        
        concateStringBuffer();
        
        System.out.println("StringBuffer : "+(System.currentTimeMillis() - startTime));
        
        
        startTime = System.currentTimeMillis();
        
        concateStringBuilder();
        
        System.out.println("StringBuilder : "+(System.currentTimeMillis() - startTime));
    }    
}
