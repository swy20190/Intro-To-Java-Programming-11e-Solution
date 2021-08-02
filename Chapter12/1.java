public class book {
    public static void main(String[] args)
    {
        if(args.length!=3){
            System.out.println("fuck you~~");
            System.exit(1);
        }
        int result = 0;
        try{
            int opt1 = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException ex)
        {
            System.out.print("Wrong input: "+args[0]);
        }
        try{
            int opt2 = Integer.parseInt(args[2]);
        }
        catch (NumberFormatException ex)
        {
            System.out.print("Wrong input: "+args[2]);
        }
    }

}
