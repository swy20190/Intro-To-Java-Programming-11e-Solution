public class book {
    public static void main(String[] args)
    {
        String head1="a";
        String head2="a^2";
        String head3="a^3";
        System.out.printf("%-8s%-8s%-8s%n",head1,head2,head3);
        for(int i=1;i<5;i++)
            System.out.printf("%-8d%-8d%-8d%n",i,i*i,i*i*i);
    }
}