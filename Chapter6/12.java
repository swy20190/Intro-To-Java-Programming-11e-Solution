public class book {
    public static void main(String[] args)
    {
        printChars('1','Z',10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine)
    {
        for(int i=1;i<=ch2-ch1+1;i++)
        {
            System.out.print((char)(i+ch1-1)+" ");
            if(i%numberPerLine==0)
                System.out.print('\n');
        }
    }
}
