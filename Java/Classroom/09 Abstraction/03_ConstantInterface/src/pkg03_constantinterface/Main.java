
package pkg03_constantinterface;

interface MY_CONSTANTS
{
    int KG_TO_G = 1000;
    double INCH_TO_CM = 2.54;
}

class Conversion
{
    double height;       // Inch
    int weight;          // Kilogram

    public Conversion(double height, int weight) 
    {
        this.height = height;
        this.weight = weight;
    }
    
    public void heightInCM() { System.out.println("Height In CM : "+(height*MY_CONSTANTS.INCH_TO_CM)); }
   
    public void weightInGM() { System.out.println("Weight In GM : "+(weight*MY_CONSTANTS.KG_TO_G)); }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Conversion opr1 = new Conversion(1, 1);
        
        opr1.heightInCM();
        opr1.weightInGM();
        
        Conversion opr2 = new Conversion(2, 5);
        
        opr2.heightInCM();
        opr2.weightInGM();
    }
}
