import java.util.*;

public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        boolean in1 = true;
        boolean in2 = true;
        int jojo = 0;
        int dio = 0;
        while(in1){
            try{
                jojo=input.nextInt();
                in1 = false;
            }
            catch (InputMismatchException jj){
                input.nextLine();
                System.out.print("Please enter an integer； ");
            }
        }
        while(in2){
            try{
                dio=input.nextInt();
                in2 = false;
            }
            catch (InputMismatchException jj){
                input.nextLine();
                System.out.print("Please enter an integer； ");
            }
        }
        int sum=jojo+dio;
        System.out.print("The sum is "+sum);
    }
}
