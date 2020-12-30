public class book {
    public static void main(String[] args)
    {
        char ass = '!';
        int count = 0;
        while(ass<='~')
        {
            System.out.print(ass+" ");
            count++;
            ass++;
            if(count%10==0)
                System.out.print("\n");
        }
    }
}
