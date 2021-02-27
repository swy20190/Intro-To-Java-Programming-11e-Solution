import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter a b c d e f: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation ass = new LinearEquation(a,b,c,d,e,f);
        if(ass.isSolvable())
            System.out.println(ass.getX()+" "+ass.getY());
        else
            System.out.println("The equation has no solutions.");
    }
}

class LinearEquation
{
    private double a,b,c,d,e,f;
    public LinearEquation(double aa,double bb,double cc,double dd,double ee,double ff){
        a=aa;
        b=bb;
        c=cc;
        d=dd;
        e=ee;
        f=ff;
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
    public double getD(){
        return d;
    }
    public double getE(){
        return e;
    }
    public double getF(){
        return f;
    }
    public boolean isSolvable(){
        return a*d-b*c!=0;
    }
    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }
}