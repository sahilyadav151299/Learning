
package pkg02_udarraylist;

import java.util.ArrayList;

class Student
{
    int rollNo;
    String name;
    int age;
    
    Student(int rollNo, String name, int age)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student(101, "Jonas", 21);
        Student s2 = new Student(102, "Martha", 20);
        Student s3 = new Student(103, "Adam", 86);
        Student s4 = new Student(104, "Nova", 53);
        
        ArrayList<Student> dark = new ArrayList<Student>();
        
        dark.add(s1);
        dark.add(s2);
        dark.add(s3);
        dark.add(s4);
        
        for(int i=0; i<dark.size(); i++)
        {
            Student character = dark.get(i);
            
            System.out.println(character.rollNo+" "+character.name+" "+character.age);
        }
    }  
} 