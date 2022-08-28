
package pkg07_encapsulation;

class Account
{
    private long accountNo;
    private double amount;
    private String name;
    
    public void setAccountNo(long accountNo) { this.accountNo = accountNo; }
    
    public void setAmount(double amount) { this.amount = amount; }
    
    public void setName(String name) { this.name = name; }
    
    public long getAccountNo() { return accountNo; }
    
    public double getAmount() { return amount; }
    
    public String getName() { return name; }
}

public class Main 
{    
    public static void main(String[] args) 
    {
        Account cust = new Account();
        
        cust.setAccountNo(12482004);
        cust.setName("Vignesh Babu");
        cust.setAmount(1111.1111);
        
        System.out.println(cust.getAccountNo());
        System.out.println(cust.getName());
        System.out.println(cust.getAmount());
    }   
}
