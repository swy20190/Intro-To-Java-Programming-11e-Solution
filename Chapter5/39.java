public class book {
    public static void main(String[] args)
    {
        double sell = 0.0;
        double earn = 5000;
        while(earn<30000)
        {
            sell++;
            if(sell<=5000)
                earn+=0.08;
            else if(sell<=10000)
                earn+=0.10;
            else
                earn+=0.12;
        }
        System.out.println("You must sell $"+sell+" at least.");
    }
}
