/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_thisuse4;

// 4) this can be passed as an argument in the method call.

import java.util.Scanner;

class Student
{
    String name;
    int age;
    
    public void takeInput(Student obj)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Name & Age");
        obj.name = kb.next();
        obj.age = kb.nextInt();
        
    }
    
    public void createAccount()
    {
        takeInput(this);
    }
    
    public void showDetails()
    {
        System.out.println(" Name : "+name+" Age : "+age);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.createAccount();
        s2.createAccount();
        
        s1.showDetails();
        s2.showDetails();
    }    
}
