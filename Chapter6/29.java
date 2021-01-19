public class book {
    public static void main(String[] args)
    {
        for(int i=2;i<=997;i++)
        {
            if(isPrime(i)&&isPrime(i+2))
                System.out.println("("+i+", "+(i+2)+")");
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
