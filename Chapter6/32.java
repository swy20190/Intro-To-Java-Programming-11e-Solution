public class book {
    public static void main(String[] args)
    {
        int winCount=0;
        for(int i=0;i<10000;i++)
        {
            if(dice())
                winCount++;
        }
        System.out.println("You won "+winCount+" times");
    }
    public static boolean dice()
    {
        int d1 = (int)(Math.random()*6)+1;
        int d2 = (int)(Math.random()*6)+1;
        int sum = d1+d2;
        if(sum==2||sum==3||sum==12) {
            return false;
        }
        else if(sum==7||sum==11) {
            return true;
        }
        else
        {
            int old = sum;
            do{
                int j1 = (int)(Math.random()*6)+1;
                int j2 = (int)(Math.random()*6)+1;
                sum=j1+j2;
                if(sum==7) {
                    return false;
                }
            }while(sum!=old);
            return true;
        }
    }
}
