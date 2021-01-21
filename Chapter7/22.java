public class book {
    public static void main(String[] args)
    {
        int count=0;
        String ass = args[0];
        int len = ass.length();
        for(int i=0;i<len;i++)
        {
            if(ass.charAt(i)<='Z'&&ass.charAt(i)>='A')
                count++;
        }
        System.out.print("There are "+count+" numbers.");
    }

}