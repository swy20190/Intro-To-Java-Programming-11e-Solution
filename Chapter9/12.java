import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the four points x1 y1 x2 y2 x3 y3 x4 y4: ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double x3=input.nextDouble();
        double y3=input.nextDouble();
        double x4=input.nextDouble();
        double y4=input.nextDouble();
        LinearEquation ass = new LinearEquation(y1-y2,x2-x1,y3-y4,x4-x3,(y1-y2)*x1-(x1-x2)*y1,(y3-y4)*x3-(x3-x4)*y3);
        if(ass.isSolvable())
            System.out.println(ass.getX()+" "+ass.getY());
        else
            System.out.println("No joining.");
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