import java.util.Date;
public class book {
    public static void main(String[] args)
    {
        Account swy = new Account(1122,2000);
        CheckingAccount swySwy = new CheckingAccount(114,514,1919);
        SavingAccount swySwySwy = new SavingAccount();
        System.out.println(swy.toString()+" "+swySwy.toString()+" "+swySwySwy.toString());

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

class CheckingAccount extends Account{
    private double overDraw;
    public CheckingAccount()
    {
        super();
    }
    public CheckingAccount(int di,double bb,double oo){
        super(di,bb);
        overDraw=oo;
    }
}

class SavingAccount extends Account{

}
