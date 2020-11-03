public class book {
    public static void main(String[] args)
    {
        double base = 312032486;
        int secnum = 365*24*3600;
        for(int i=1;i<6;i++)
        {
            base=base+secnum/7.0-secnum/13.0+secnum/45.0;
            System.out.println("The population in year "+i+" is "+(int)base);
        }
    }
}