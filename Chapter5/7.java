public class book {
    public static void main(String[] args)
    {
       double ass = 10000;
       for(int i=0;i<10;i++)
           ass*=(1+0.05);
       double oldAss = ass;
       double sum = 0;
       for(int i=0;i<4;i++)
       {
           sum+=ass;
           ass*=(1+0.05);
       }
       System.out.printf("Ass after 10 years is %.2f\n",oldAss);
       System.out.printf("The total cost of 4 asses is %.2f\n",sum);
    }
}