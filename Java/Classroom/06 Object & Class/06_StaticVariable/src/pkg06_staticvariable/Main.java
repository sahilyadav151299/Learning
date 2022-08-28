
package pkg06_staticvariable;

// The static keyword in Java is used for memory management mainly. 
// We can apply static keyword with variables, methods, blocks and nested classes. 
// The static keyword belongs to the class than an instance of the class.

// The static variable can be used to refer to the common property of all objects.
// The static variable gets memory only once in the class area at the time of class loading.

class Student
{
    int roll;
    String name;
    static String college = "BCE";
    static int studentCount = 0;              // Used as a counter variable
    
    Student(int getRoll, String getName)
    {
        roll = getRoll;
        name = getName;
        studentCount++;
    }
    
    public void showDetails()
    {
        System.out.println("Roll No : "+roll+" Name : "+name+" College : "+college);
    }        
}

public class Main 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student(101, "Sahil");
        Student s2 = new Student(102, "Rohan");
        Student s3 = new Student(103, "Vijay");
        Student s4 = new Student(104, "Rohit");
        
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
        s4.showDetails();
        
        Student.college = "BIST";   // To change college name for all students we need only single line of code.
        
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
        s4.showDetails();
        
        System.out.println("Total Student : "+Student.studentCount);
    }    
}
