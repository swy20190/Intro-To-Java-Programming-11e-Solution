import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a b c: ");
        double[] s = new double[3];
        for(int i=0;i<3;i++)
            s[i]=input.nextDouble();
        double[] r = new double[2];
        int ass = solveQuadratic(s,r);
        System.out.println(ass +" roots");
        for(int i=0;i<ass;i++)
            System.out.print(r[i]+" ");
    }
    public static int solveQuadratic(double[] eqn,double[] roots)
    {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double delta = b*b-4*a*c;
        if(delta<0)
            return 0;
        else if (delta==0)
        {
            roots[0]=-1*b/(2*a);
            return 1;
        }
        else
        {
            roots[0]=(-1*b+Math.sqrt(delta))/(2*a);
            roots[1]=(-1*b-Math.sqrt(delta))/(2*a);
            return 2;
        }
    }
}