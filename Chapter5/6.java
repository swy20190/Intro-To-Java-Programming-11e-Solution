public class book {
    public static void main(String[] args)
    {
       System.out.println("英里     千米     千米     英里");
       for(int i=1;i<=10;i++)
           System.out.printf("%-8d%-7.3f  %-8d%-6.3f\n",i,i*1.609,5*i+15,(5*i+15)/1.609);
    }
}