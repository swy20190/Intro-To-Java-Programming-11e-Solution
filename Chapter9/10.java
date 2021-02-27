import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation ass = new QuadraticEquation(a,b,c);
        if(ass.getDiscriminant()<0)
            System.out.println("The equation has no roots.");
        else if(ass.getDiscriminant()==0)
            System.out.println("One root "+ass.getRoot1());
        else
            System.out.println("Two roots "+ass.getRoot1()+" "+ass.getRoot2());
    }
}

class QuadraticEquation
{
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double aa,double bb,double cc){
        a=aa;
        b=bb;
        c=cc;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return (-1*b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public double getRoot2(){
        return (-1*b-Math.sqrt(b*b-4*a*c))/(2*a);
    }
}