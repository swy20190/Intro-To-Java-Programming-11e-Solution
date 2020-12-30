public class book {
    public static void main(String[] args)
    {
        double l2r = 0;
        double r2l = 0;
        double base1 = 1.0;
        double base2 =50000.0;
        for(int i=1;i<=50000;i++)
        {
            l2r+=1/base1;
            base1+=1;
        }
        for(int i=1;i<=50000;i++)
        {
            r2l+=1/base2;
            base2-=1;
        }
        System.out.println("From left to right: "+l2r);
        System.out.println("From right to left: "+r2l);
    }
}
