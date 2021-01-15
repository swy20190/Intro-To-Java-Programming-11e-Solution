public class book {
    public static void main(String[] args)
    {
        int count = 0;
        int base = 0;
        for(int i=101;i<=2100;i++)
        {
            boolean isLeap = (i%4==0&&i%100!=0)||(i%400==0);
            if(isLeap)
            {
                System.out.print(i+" ");
                count++;
                if(count%10==0&&count!=base)
                {
                    System.out.print("\n");
                    base+=10;
                }
            }
        }
        System.out.print('\n');
        System.out.println("The total number is "+count);
    }
}
