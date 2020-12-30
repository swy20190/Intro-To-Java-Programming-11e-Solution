public class book {
    public static void main(String[] args)
    {
        double item = 0.0;
        double sum = 0.0;
        for(int i=10000;i<=100000;i+=10000)
        {
            item = 1.0;
            sum = 0.0;
            for(int j=1;j<=i;j++)
            {
                sum+=1.0*item/(2*j-1);
                item*=(-1);
            }
            System.out.printf("i=%d, pi=%f\n",i,sum*4);
        }
    }
}
