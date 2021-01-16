import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter the first string: ");
        Scanner input = new Scanner(System.in);
        String ass = input.nextLine();
        System.out.print("Enter the second string: ");
        String dick = input.nextLine();
        int len1 = ass.length();
        int len2 = dick.length();
        int range = Math.min(len1,len2);
        if(ass.charAt(0)!=dick.charAt(0))
            System.out.println(ass+" and "+dick+" have no common prefix");
        else {
            System.out.print("The common prefix is ");
            for (int i = 0; i < range; i++) {
                if (ass.charAt(i) == dick.charAt(i))
                    System.out.print(ass.charAt(i));
            }
            System.out.println("");
        }
    }
}
