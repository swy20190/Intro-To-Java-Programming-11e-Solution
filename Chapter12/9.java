import java.util.*;

public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a bin-string: ");
        String jojo = input.next();
        try{
            int dio = binToDecimal(jojo);
            System.out.print(dio);
        }catch (NumberFormatException starplatium){
            System.out.print(starplatium);
            System.exit(1);
        }
    }
    public static int binToDecimal (String hex)
    throws BinaryFormatException{
        int decimalValue = 0;
        for(int i=0;i<hex.length();i++){
            char hexChar=hex.charAt(i);
            if(hexChar=='0'||hexChar=='1'){
                decimalValue=decimalValue*2+binCharToDecimal(hexChar);
            }
            else{
                throw new NumberFormatException("Not a binstring!");
            }
        }
        return decimalValue;
    }
    public static int binCharToDecimal(char ch){
        return ch-'0';
    }
}

class BinaryFormatException extends  NumberFormatException{
    public BinaryFormatException(String jesus){
        super(jesus);
    }
}
