
package pkg01_string;

public class Main 
{
    public static void main(String[] args) 
    {
        // String is an object that represents sequence of char values.
        // String is immutable i.e. unchangable.
        // Whenever we change any string, a new instance is created.
        // The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
        // The java.lang.String class is used to create a string object.
        // Due to immutability of string objects, it generates heavy garbage. Hence we have GC.
        
        
  
        // There are 2 ways of creating string object
        
        // 1) Using String Literal
        
        String str1 = "Ramayan";
        
        // Each time you create a string literal, the JVM checks the "string constant pool" first. 
        // If the string already exists in the pool, a reference to the pooled instance is returned. 
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
        
        String str2 = "Holybooks";      // New Instance Created
        String str3 = "Holybooks";      // Not Created
        
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        
        // Why Java uses the concept of String literal? 
        // To make Java more memory efficient 
        // (because no new objects are created if it exists already in the string constant pool).
        
        
        
        
        // 2) Using String Class Constructor
        
        String s1 = new String();
        s1 = "Bhopal";
        
        String s2 = new String("Indore");
        
        char ch1[] = {'G','o','a'};
        String s3 = new String(ch1);
        
        char ch2[] = {'h','e','l','l','o','n','d','o','n'};
        String s4 = new String(ch2, 3, 6);
        
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3); 
        System.out.println(s4); 
        
        
        // Whenever we create object of string using constructor, object are created in following manner
        
        
        String s11 = new String("Class");       // It first checks in string pool & make object if not present.    
                                                // Also created object in heap area.
  
        String s22 = new String("Class");       // Creates new object in heap only.
        
        String s33 = "Student";                 // Creates new object in pool area;
        
        String s44 = "Student";                 // Refers already created object in pool area;
        
        String s55 = "Class";                   // Refers alreday created object in pool area;
    }
}
