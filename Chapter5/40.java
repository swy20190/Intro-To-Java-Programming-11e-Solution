public class book {
    public static void main(String[] args)
    {
        int zheng = 0;
        int fan = 0;
        for(int i=0;i<1000000;i++)
        {
            if(Math.random()>0.5)
                zheng++;
            else
                fan++;
        }
        System.out.println("正面"+zheng+"次，反面"+fan+"次");
    }
}
