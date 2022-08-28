
package pkg08_copyingarray;

public class Main 
{
    public static void main(String[] args) 
    {
        char copyFrom[] = {'h','e','l','l','o','n','e','l','y'};
        
        char copyTo[] = new char[6];
        
        System.arraycopy(copyFrom, 3, copyTo, 0, 6);
        
        String str = String.valueOf(copyTo);
        
        System.out.println(str);
    }
}
