import java.util.*;
import java.io.*;

public class book {
    public static void main(String[] args)
            throws Exception
    {
        if(args.length!=2){
            System.out.println("Usage: damn fool!");
            System.exit(1);
        }

        File src = new File(args[1]);
        StringBuilder tmp= new StringBuilder();
        if(!src.exists()){
            System.out.println("src does not exist!");
            System.exit(2);
        }
        try(Scanner input = new Scanner(src);)
        {
            while(input.hasNext()){
                String jj = input.nextLine();
                tmp.append(jj.replaceAll(args[0], "")+'\n');
            }
        }
        src.delete();
        File dst = new File(args[1]);
        try(PrintWriter output = new PrintWriter(dst);) {
            output.print(tmp);
        }
    }
}
