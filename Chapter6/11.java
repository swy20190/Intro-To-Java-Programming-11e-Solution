public class book {
    public static void main(String[] args)
    {
        System.out.println("销售总额\t\t\t酬金");
        System.out.println("-------------------");
        for(int i=10000;i<=100000;i+=5000)
            System.out.printf("%-6d\t\t%7.1f\n",i,computeCommission(i*1.0));
    }
    public static double computeCommission(double salesAmount)
    {
        double ass=0;
        if(salesAmount<=5000)
            ass=salesAmount*0.08;
        else if(salesAmount<=10000)
            ass=5000*0.08+(salesAmount-5000)*0.10;
        else
            ass=5000*0.08+5000*0.10+(salesAmount-10000)*0.12;
        return ass;
    }
}
