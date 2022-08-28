
package pkg10_thisuse1;

// This is a reference variable that refers to the current object
// Implicitly provided by Java in each method of the class.
// This is completely loacl to any method.
// Once the execution of method is done "this" is also get destroyed.

// 1) this can be used to refer current class instance variable.
// To avoid drawback occurs due to locality of reference.

class Student
{
    int roll;
    String name;
    
    Student(int roll, String name)
    {
        this.roll = roll;
        this.name = name;
    }
    
    public void showDetails()
    {
        System.out.println("Roll no : "+roll+" Name : "+name);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student(101, "Sahil");
        Student s2 = new Student(102, "Vikas");
        
        s1.showDetails();
        s2.showDetails();
    }    
}
