public class book {
    public static void main(String[] args)
    {
        double sum=0;
        for(int i=625;i>=2;i--)
            sum+=1.0/(Math.sqrt(i-1)+Math.sqrt(i));
        System.out.println("The result is "+sum);
    }
}
