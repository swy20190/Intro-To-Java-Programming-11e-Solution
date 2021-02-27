public class book {
    public static void main(String[] args)
    {
        RegularPolygon p = new RegularPolygon();
        RegularPolygon pp = new RegularPolygon(6,4);
        RegularPolygon ppp = new RegularPolygon(10,4,5.6,7.8);
        System.out.println(p.getPerimeter()+" "+p.getArea());
        System.out.println(pp.getPerimeter()+" "+pp.getArea());
        System.out.println(ppp.getPerimeter()+" "+ppp.getArea());
    }
}

class RegularPolygon
{
    private int n=3;
    private double side=1;
    private double x=0;
    private double y=0;
    public RegularPolygon(){
        n=3;
        side=1;
    }
    public RegularPolygon(int num,double len){
        n=num;
        side=len;
    }
    public RegularPolygon(int hum,double len,double xx,double yy){
        n=hum;
        side=len;
        x=xx;
        y=yy;
    }
    public void setN(int nn){
        n=nn;
    }
    public int getN(){
        return n;
    }
    public void setSide(double ss){
        side=ss;
    }
    public double getSide(){
        return side;
    }
    public void setX(double xx){
        x=xx;
    }
    public double getX(){
        return x;
    }
    public void setY(double yy){
        y=yy;
    }
    public double getY(){
        return y;
    }
    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        return n*side*side/(4*Math.tan(Math.PI/n));
    }
}