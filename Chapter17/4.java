import java.util.*;
import java.io.*;

public class book {
    public static void main(String[] args)
            throws Exception
    {
        File yukikaze = new File(args[0]);
        Scanner input = new Scanner(yukikaze);
        String nagato="";
        while(input.hasNext())
            nagato+=input.nextLine();
        input.close();
        try(DataOutputStream shimakaze = new DataOutputStream(new FileOutputStream(args[1]));){
            shimakaze.writeChars(nagato);
        }
    }
}
