public class book {
    public static void main(String[] args)
    {
        System.out.println("The random number is "+getRandom(1,1,4,5,1,4,1,9,1,9,8,1,0));
    }
    public static int getRandom(int... numbers)
    {
        int jb=(int)(Math.random()*54)+1;
        while(inArray(numbers,jb))
            jb=(int)(Math.random()*54)+1;
        return jb;
    }
    public static boolean inArray (int[] ass,int dick)
    {
        for (int value : ass) {
            if (value == dick)
                return true;
        }
        return false;
    }
}