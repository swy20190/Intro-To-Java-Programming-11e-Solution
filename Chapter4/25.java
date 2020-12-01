public class book {
    public static void main(String[] args)
    {
        String ass = "";
        for(int i=0;i<3;i++)
            ass += (char)((int)('A'+Math.random()*26));
        for(int i=0;i<4;i++)
            ass+=(char)('0'+Math.random()*10);
        System.out.println("The AV-code is "+ass);
    }
}
