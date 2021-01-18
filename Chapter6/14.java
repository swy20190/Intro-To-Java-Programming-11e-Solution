public class book {
    public static void main(String[] args)
    {
        System.out.println("i\t\tm(i)");
        System.out.println("--------------");
        for(int i=1;i<=901;i+=100)
            System.out.printf("%-2d\t\t%7.4f\n",i,m(i));
    }
    public static double m(int n)
    {
        double sum = 0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
                sum+=1.0/(2*i-1);
            else
                sum-=1.0/(2*i-1);
        }
        return 4.0*sum;
    }
}