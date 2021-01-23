import java.util.Scanner;
import java.util.Arrays;
public class book {
    public static void main(String[] args)
    {
        String[] words = {"program","is","fun","while","damnhard","swyswyswy"};
        play(words);
    }
    public static void play(String[] words)
    {
        Scanner input = new Scanner(System.in);
        char cont = 'y';
        while(cont=='y')
        {
            playARound(words);
            System.out.print("Do you want to guess another word?Enter y or n>: ");
            cont=input.next().charAt(0);
            while(cont!='y'&&cont!='n')
            {
                System.out.print("Do you want to guess another word?Enter y or n>: ");
                cont=input.next().charAt(0);
            }
        }
    }
    public static void playARound(String[] words)
    {
        Scanner input = new Scanner(System.in);
        String word = words[(int)(Math.random()*words.length)];
        int len = word.length();
        char[] letters = new char[len];
        for(int i=0;i<len;i++)
            letters[i]='0';
        int lettersPointer = 0;
        int missCount = 0;
        int notGuessed = len;
        while(notGuessed>0)
        {
            System.out.print("(Guess) Enter a letter in word "+alter(word,letters)+" > ");
            char guessLetter = input.next().charAt(0);
            if(belongs(guessLetter,letters))
                System.out.println(guessLetter+" is already in the word");
            else if(!belongs(guessLetter,word))
            {
                System.out.println(guessLetter+" is not in the word");
                missCount++;
            }
            else
            {
                letters[lettersPointer]=guessLetter;
                lettersPointer++;
                notGuessed-=occurTime(guessLetter,word);
            }
        }
        System.out.println("The word is "+word+". You missed "+missCount+" time(s)");
    }
    public static String alter(String word,char[] letters)
    {
        String re = "";
        int len = word.length();
        for(int i=0;i<len;i++)
        {
            if(belongs(word.charAt(i),letters))
                re+=word.charAt(i);
            else
                re+='*';
        }
        return re;
    }
    public static boolean belongs(char key,char[] letters)
    {
        for (char letter : letters) {
            if (letter == key)
                return true;
        }
        return false;
    }
    public static boolean belongs(char key,String word)
    {
        for(int i=0;i<word.length();i++)
        {
            if(key==word.charAt(i))
                return true;
        }
        return false;
    }
    public static int occurTime(char key,String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++) {
            if (key == word.charAt(i))
                count++;
        }
        return count;
    }
}
