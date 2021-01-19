public class book {
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++)
        {
            System.out.print(getRandomUpperCaseLetter()+" ");
            if(i%10==0)
                System.out.print('\n');
        }
        for(int i=1;i<=100;i++)
        {
            System.out.print(getRandomDigitCharacter()+" ");
            if(i%10==0)
                System.out.print('\n');
        }
    }
    public static char getRandomCharacter(char ch1,char ch2)
    {
        return (char)(ch1+Math.random()*(ch2-ch1+1));
    }
    public static char getRandomUpperCaseLetter()
    {
        return getRandomCharacter('A','Z');
    }
    public static char getRandomDigitCharacter()
    {
        return getRandomCharacter('0','9');
    }
}
