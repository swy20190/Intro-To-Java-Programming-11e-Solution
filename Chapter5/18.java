public class book {
    public static void main(String[] args)
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.print('\n');
        }
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=7-i;j++)
                System.out.print(j+" ");
            System.out.print('\n');
        }
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6-i;j++)
                System.out.print("  ");
            for(int j=i;j>=1;j--)
                System.out.print(j+" ");
            System.out.print('\n');
        }
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=i-1;j++)
                System.out.print("  ");
            for(int j=1;j<=7-i;j++)
                System.out.print(j+" ");
            System.out.print('\n');
        }
    }
}
