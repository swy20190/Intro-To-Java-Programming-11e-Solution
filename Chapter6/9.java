public class book {
    public static void main(String[] args)
    {
        System.out.println("英尺\t 米\t\t\t 米\t     英尺");
        System.out.println("-----------------------------------");
        for(int i=1;i<=10;i++)
            System.out.printf("%4.1f\t%.3f\t\t%.1f\t%7.3f\n",i*1.0,MM.footToMeter(i*1.0),(5.0*i+15),MM.meterToFoot(5.0*i+15));
    }

}

class MM{
    public static double footToMeter(double foot)
    {
        return 0.305*foot;
    }
    public static double meterToFoot(double meter)
    {
        return 3.279*meter;
    }
}
