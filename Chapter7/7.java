public class book {
    public static void main(String[] args)
    {
        int[] ass = new int[10];
        for(int i=0;i<100;i++)
            ass[(int)(Math.random()*10)]++;
        for(int i=0;i<10;i++)
            System.out.printf("%d occurs %d times\n",i,ass[i]);
    }
}