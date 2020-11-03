public class book {
    public static void main(String[] args)
    {
        double signal = 1.0;
        double sum = 0.0;
        for(int i=1;i<7;i++)
        {
            sum+=signal*1.0/(2*i-1);
            signal*=-1.0;
        }
        System.out.println(4.0*sum);
        sum = 0.0;
        for(int i=1;i<8;i++)
        {
            sum+=signal*1.0/(2*i-1);
            signal*=-1.0;
        }
        System.out.println(4.0*sum);
    }
}