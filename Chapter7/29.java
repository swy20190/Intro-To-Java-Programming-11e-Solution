public class book {
    public static void main(String[] args)
    {
        int count = 0;
        while(true)
        {
            int card1 = (int)(Math.random()*52);
            int card2 = (int)(Math.random()*52);
            while(card2==card1)
                card2=(int)(Math.random()*52);
            int card3 = (int)(Math.random()*52);
            while(card3==card1||card3==card2)
                card3=(int)(Math.random()*52);
            int card4 = (int)(Math.random()*52);
            while(card4==card3||card4==card2||card4==card1)
                card4=(int)(Math.random()*52);
            count++;
            if(card1%13+card2%13+card3%13+card4%13+4==24)
                break;
        }
        System.out.print("There are "+count+" times.\n");
    }
}
