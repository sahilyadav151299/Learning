
package pkg10_thisuse3;

// 3) this can be used to invoke current class constructor.

class Student
{
    int roll;
    int age;
    String name;
    
    Student(int getRoll)
    {
        roll = getRoll;
    }
    
    Student(int getRoll, int age, String name)
    {
        this(getRoll);      // Should be at very first line
        
        this.age = age;
        this.name = name;
    }
    
    public void showDetails()
    {
        System.out.println("Roll no : "+roll+" Name : "+name+" Age : "+age);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student(101, 18, "Sahil");
        Student s2 = new Student(102, 20, "Ishan");
        
        s1.showDetails();
        s2.showDetails();
    }    
}
