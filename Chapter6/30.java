public class book {
    public static void main(String[] args)
    {
        dice();
    }
    public static boolean dice()
    {
        int d1 = (int)(Math.random()*6)+1;
        int d2 = (int)(Math.random()*6)+1;
        int sum = d1+d2;
        if(sum==2||sum==3||sum==12) {
            System.out.printf("You rolled %d+%d = %d\nYou lose\n",d1,d2,sum);
            return false;
        }
        else if(sum==7||sum==11) {
            System.out.printf("You rolled %d+%d = %d\nYou win\n",d1,d2,sum);
            return true;
        }
        else
        {
            System.out.printf("You rolled %d+%d = %d\n",d1,d2,sum);
            System.out.println("point is "+sum);
            int old = sum;
            do{
                int j1 = (int)(Math.random()*6)+1;
                int j2 = (int)(Math.random()*6)+1;
                sum=j1+j2;
                System.out.printf("You rolled %d+%d = %d\n",j1,j2,sum);
                if(sum==7) {
                    System.out.println("You lose");
                    return false;
                }
                else if(sum!=old)
                    System.out.println("point is "+sum);
            }while(sum!=old);
            System.out.println("You win");
            return true;
        }
    }
}
