import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hour = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double ftax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stax = input.nextDouble();
        System.out.printf("Employee name: %s\n",name);
        System.out.printf("Hours worked: %.2f\nPay Rate: $%.2f\nGross Pay: $%.2f\n",hour,payRate,hour*payRate);
        System.out.printf("Deductions:\n  Federal Withholding (%f%%): $%.2f\n  State Withholding (%f%%): $%.2f\n  Total Deduction: $%.2f\n",ftax*100,ftax*hour*payRate,stax*100,stax*hour*payRate,ftax*hour*payRate+stax*hour*payRate);
        System.out.printf("Net Pay: $%.2f\n",hour*payRate*(1-ftax-stax));
    }
}
