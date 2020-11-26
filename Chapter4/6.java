public class book {
    public static void main(String[] args)
    {
        final double PI = 3.141592654;
        double alpha1 = Math.random()*2*PI;
        double alpha2 = Math.random()*2*PI;
        double alpha3 = Math.random()*2*PI;
        double x1 = 40*Math.cos(alpha1);
        double y1 = 40*Math.sin(alpha1);
        double x2 = 40*Math.cos(alpha2);
        double y2 = 40*Math.sin(alpha2);
        double x3 = 40*Math.cos(alpha3);
        double y3 = 40*Math.sin(alpha3);
        double a = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double b = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double c = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double aa = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
        double ab = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
        double ac = Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*a*b)));
        System.out.println("The three angles are: "+aa+" "+ab+" "+ac);
    }
}
