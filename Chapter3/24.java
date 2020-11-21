public class book {
    public static void main(String[] args)
    {
        int num = (int)(Math.random()*13);
        int dick = (int)(Math.random()*4);
        String[] nums = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] dicks = {"Clubs","Diamonds","Hearts","Spades"};
        System.out.println("The card you picked is "+nums[num]+" of "+dicks[dick]);
    }
}