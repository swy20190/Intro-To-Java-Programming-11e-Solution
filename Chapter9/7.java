import java.util.Date;
public class book {
    public static void main(String[] args)
    {
        Account swy = new Account(1122,2000);
        swy.setAnnualInterestRate(4.5/100);
        swy.withDraw(2500);
        swy.deposit(3000);
        System.out.println("Balance: "+swy.getBalance());
        System.out.println("Monthly Interest: "+swy.getMonthlyInterest());
        System.out.println("Register Date: "+swy.getDateCreated().toString());
    }
}

class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account()
    {
        id=0;
        balance=0;
        annualInterestRate=0;
        dateCreated=new Date();
    }
    public Account(int di,double b)
    {
        id=di;
        balance=b;
        annualInterestRate=0;
        dateCreated=new Date();
    }
    public int getId(){
        return id;
    }
    public void setId(int j){
        id=j;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double j){
        balance=j;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double j){
        annualInterestRate=j;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return annualInterestRate/12*balance;
    }
    public void withDraw(double m){
        balance-=m;
    }
    public void deposit(double m){
        balance+=m;
    }
}