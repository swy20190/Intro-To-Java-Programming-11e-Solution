public class book {
    public static void main(String[] args)
    {
        double x1 = 35.2270869;
        double y1 = -80.8431267;
        double x2 = 32.0835407;
        double y2 = -81.0998342;
        double dcs = 6371.0*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));
        x2 = 33.7489954;
        y2 = -84.3879824;
        double dca = 6371.0*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));
        x1 = 28.5383355;
        y1 = -81.3792365;
        double doa = 6371.0*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));
        x2 = 32.0835407;
        y2 = -81.0998342;
        double dos = 6371.0*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));
        x1 = 33.7489954;
        y1 = -84.0998342;
        double das = 6371.0*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));
        double s1 = (dca+dcs+das)/2;
        double s2 = (doa+dos+das)/2;
        double a = Math.sqrt(s1*(s1-dca)*(s1-dcs)*(s1-das))+Math.sqrt(s2*(s2-doa)*(s2-dos)*(s2-das));
        System.out.println("The area is "+a+" km^2");
    }
}
