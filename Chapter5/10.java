public class book {
    public static void main(String[] args)
    {
       int count=0;
       int base = 0;
       for(int i=100;i<=1000;i++)
       {
           if(i%5==0&&i%6==0)
           {
               count++;
               System.out.print(i+" ");
           }
           if(count%10==0&&count!=base) {
               System.out.print("\n");
               base+=10;
           }
       }
    }
}