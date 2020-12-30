public class book {
    public static void main(String[] args)
    {
        for(int i =10000;i<=100000;i+=10000)
        {
            double item = 1.0;
            double e = 1.0;
            for(int j=1;j<=i;j++)
            {
                item/=j;
                e+=item;
            }
            System.out.printf("i=%d, e=%f\n",i,e);
        }
    }
}
