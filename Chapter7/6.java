public class book {
    public static void main(String[] args)
    {
        int[] ass =new int[60];
        ass[0]=2;
        int count=1;
        while(true)
        {
            if(count==50)
                break;
            else{
                int base = ass[count-1];
                while(true)
                {
                    base++;
                    if(isPrime(base,ass,count))
                    {
                        ass[count]=base;
                        count++;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<count;i++)
            System.out.print(ass[i]+" ");
    }
    public static boolean isPrime(int num,int[] dicks,int count)
    {
        boolean re = true;
        for(int i=0;i<count;i++)
        {
            if(dicks[i]>Math.sqrt(num))
                break;
            if(num%dicks[i]==0)
            {
                re = false;
                break;
            }
        }
        return re;
    }

}