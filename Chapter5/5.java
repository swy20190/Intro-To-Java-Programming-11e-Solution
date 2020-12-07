public class book {
    public static void main(String[] args)
    {
       System.out.println("千克       磅      磅      千克");
       for(int i=1;i<=100;i++)
           System.out.printf("%-5d%8.1f     %-4d%8.2f\n",2*i-1,(2*i-1)*2.2,5*i+15,(5*i+15)/2.2);
    }
}