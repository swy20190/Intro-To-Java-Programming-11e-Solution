import java.util.*;

public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex-string: ");
        String jojo = input.next();
        try{
            int dio = hexToDecimal(jojo);
            System.out.print(dio);
        }catch (NumberFormatException starplatium){
            System.out.print(starplatium);
            System.exit(1);
        }
    }
    public static int hexToDecimal (String hex)
    throws NumberFormatException{
        int decimalValue = 0;
        hex=hex.toUpperCase();
        for(int i=0;i<hex.length();i++){
            char hexChar=hex.charAt(i);
            if((hexChar>='A'&&hexChar<='F')||(hexChar>='0'&&hexChar<='9')){
                decimalValue=decimalValue*16+hexCharToDecimal(hexChar);
            }
            else{
                throw new NumberFormatException("Not a hexstring!");
            }
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if(ch>='A'&&ch<='F')
            return 10+ch-'A';
        else
            return ch-'0';
    }
}
