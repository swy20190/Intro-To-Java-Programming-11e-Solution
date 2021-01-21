public class book {
    public static void main(String[] args)
    {
        int[] pattern = new int[4];
        int countPick = 0;
        int countPattern = 0;
        while(countPattern<4)
        {
            int card = (int)(Math.random()*52);
            countPick++;
            if(pattern[card/13]==0) {
                pattern[card / 13] = card;
                countPattern++;
            }
        }
        String[] dock = {"Spades","Clubs","Hearts","Diamonds"};
        String[] point={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        for(int i=0;i<4;i++)
            System.out.printf("%s of %s\n",point[pattern[i]%13],dock[i]);
        System.out.println("Number of picks: "+countPick);
    }

}