public class book {
    public static void main(String[] args)
    {
       System.out.println("千克         磅");
       for(int i=1;i<=100;i++)
           System.out.printf("%-6d%8.1f\n",i*2-1,(2*i-1)*2.2);
    }
}