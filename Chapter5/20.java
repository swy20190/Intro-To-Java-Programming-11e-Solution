public class book {
    public static void main(String[] args)
    {
        int lineBase = 0;
        int count = 0;
        for(int i = 2;i <= 1000;i++)
        {
            boolean isPrime = true;
            for(int j = 2;j<i;j++)
            {
                if(i%j==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                count++;
                System.out.printf("%-5d",i);
                if(count%8==0&&count!=lineBase)
                {
                    System.out.print("\n");
                    lineBase+=8;
                }
            }
        }
    }
}
