public class book {
    public static void main(String[] args)
    {
        for(int i=0;i<8;i++)
        {
            for(int j=1;j<=7-i;j++)
                System.out.print("     ");
            for(int j=0;j<i;j++)
                System.out.printf("%5d",(int)(Math.pow(2,j)));
            for(int j=i;j>=0;j--)
                System.out.printf("%5d",(int)(Math.pow(2,j)));
            System.out.print('\n');
        }
    }
}
