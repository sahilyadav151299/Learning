
package pkg01_if_else;

public class Main 
{
    public static void main(String[] args) 
    {
        // The Java if statement is used to test the condition. 
        // It checks boolean condition: true or false. 
        // There are 4 of if statement in Java.
        
        // 1) If Statement

        int age = 20;
        
        if(age >= 18)  
            System.out.println("You Can Vote");    
        
        
        // 2) If Else Statement
        
        int num = 25;
        
        if(num%2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
        
        
        // 3) If Else If Ladder
        
        int marks = 95;
        
        if(marks >= 90)
            System.out.println("A Grade");
        else if(marks >= 80 && marks <= 89)
            System.out.println("B Grade");
        else if(marks >= 70 && marks <= 79)
            System.out.println("C Grade");
        else
            System.out.println("D Grade");
        
        
        // 4) Nested If
        
        int year = 1998;
        
        if(year%100 == 0)
        {
            if(year%400 == 0)
                System.out.println("Leap Year");
            else
                System.out.println("Not A Leap Year");
        }
        else
        {
            if(year%4 == 0)
                System.out.println("Leap Year");
            else
                System.out.println("Not A Leap Year");
        }
    }
}
