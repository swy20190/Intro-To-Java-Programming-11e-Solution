public class book {
    public static void main(String[] args)
    {
        int month = (int)(Math.random()*12+1);
        String[] names={"Feb","Jan","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        System.out.println("The number is "+month+", and the month is "+names[month-1]);
    }
}
