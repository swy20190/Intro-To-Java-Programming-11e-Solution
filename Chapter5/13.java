public class book {
    public static void main(String[] args)
    {
        int n = 0;
        while(n*n*n<12000)
            n++;
        System.out.println("The n is "+(n-1));
    }
}