
package pkg10_thisuse2;

// 2) this can be used to invoke current class method (implicitly).

class Student
{
    int roll;
    String name;
    
    public void takeInput(int roll, String name)
    {
        this.roll = roll;
        this.name = name;
    }
    
    public void creatAccount(int getRoll, String getName)
    {
        this.takeInput(getRoll,getName);
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
        Student s1 = new Student();
        s1.creatAccount(101, "Sahil");
        
        Student s2 = new Student();
        s2.creatAccount(102, "Somya");
        
        s1.showDetails();
        s2.showDetails();
    }    
}
