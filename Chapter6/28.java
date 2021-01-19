public class book {
    public static void main(String[] args)
    {
        System.out.println("p           2^p-1");
        System.out.println("-----------------");
        for(int i=2;i<=31;i++)
        {
            int jb = (int)Math.pow(2,i)-1;
            if(isPrime(jb))
                System.out.printf("%d\t\t%-2d\n",i,jb);
        }
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
