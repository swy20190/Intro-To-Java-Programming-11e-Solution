public class book {
    public static void main(String[] args)
    {
        int count=0;
        int base=0;
        int dick = 2;
        while(count<100)
        {
            if(isPrime(dick)&&isPalindrome(dick))
            {
                System.out.print(dick+" ");
                count++;
            }
            if(count%10==0&&count!=base) {
                System.out.print('\n');
                base+=10;
            }
            dick++;
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
    public static boolean isPalindrome(int n)
    {
        String ass = Integer.toString(n);
        for(int i=0;i<ass.length();i++)
        {
            if(ass.charAt(i)!=ass.charAt(ass.length()-1-i))
                return false;
        }
        return true;
    }
}