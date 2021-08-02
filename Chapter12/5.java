public class book {
    public static void main(String[] args)
    {
        try{
            Triangle ass = new Triangle(1,1,4);
        }catch(IllegalTriangleException jj){
            System.out.println("You smart ass!");
            System.out.println(jj);
            System.exit(1);
        }
    }
}

class IllegalTriangleException extends Exception{
    private double s1;
    private double s2;
    private double s3;

    public IllegalTriangleException(double aa, double bb, double cc){
        super("Invalid sides "+aa+" "+bb+" "+cc);
        s1=aa;
        s2=bb;
        s3=cc;
    }
}

class Triangle{
    private double s1;
    private double s2;
    private double s3;
    public Triangle(double aa,double bb,double cc)
    throws IllegalTriangleException {
        if(aa<bb+cc&&bb<aa+cc&&cc<aa+bb) {
            s1 = aa;
            s2 = bb;
            s3 = cc;
        }
        else
            throw new IllegalTriangleException(aa,bb,cc);
    }
}
