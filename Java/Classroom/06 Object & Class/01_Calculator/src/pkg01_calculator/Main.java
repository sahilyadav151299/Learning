
package pkg01_calculator;

import java.util.Scanner;

class Calculator
{
    int num1;                       // Instance Variable/Class Variable/Data Members                 
    int num2;                       // Instance Variable/Class Variable/Data Members
    String opr;                     // Instance Variable/Class Variable/Data Members
    
    public void input()             // Instance Method/Method/Member Function
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter 2 no's & 1 operation");
        
        num1 = kb.nextInt();
        num2 = kb.nextInt();
        opr = kb.next();
    }        
    
    public void add()               // Instance Method/Method/Member Function
    {
        System.out.println("Sum is : "+(num1+num2));
    }        
    
    public void sub()               // Instance Method/Method/Member Function
    {
        System.out.println("Sub is : "+(num1-num2));
    }
    
    public void mul()               // Instance Method/Method/Member Function
    {
        System.out.println("Mul is : "+(num1*num2));
    }
    
    public void div()               // Instance Method/Method/Member Function
    {
        System.out.println("Div is : "+(num1/num2));
    }        
}


public class Main 
{
    public static void main(String[] args) 
    {
        Calculator opr1 = new Calculator();             // opr1 is an Object/Instance of class Calculator
        
        opr1.input();                                   // Instance method called by opr1    
        
        switch(opr1.opr)                                // Instance variable accessed by opr1
        {
            case "add": opr1.add(); break;
                
            case "sub": opr1.sub(); break;
                
            case "mul": opr1.mul(); break;
                
            case "div": opr1.div(); break;
                
            default: System.out.println("Enter Correct Inputs");     
        }
    }    
}
