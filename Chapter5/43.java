public class book {
    public static void main(String[] args)
    {
        int count = 0;
        for(int i=1;i<=6;i++)
            for(int j=i+1;j<=7;j++)
            {
                System.out.printf("%d  %d\n",i,j);
                count++;
            }
        System.out.println("The total number of all combinations is "+count);
    }
}
