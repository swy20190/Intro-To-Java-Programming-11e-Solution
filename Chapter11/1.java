import java.util.Date;
import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides, color and filled: ");
        double s1=input.nextDouble();
        double s2=input.nextDouble();
        double s3=input.nextDouble();
        String c=input.next();
        boolean filled = input.nextBoolean();
        Triangle ass = new Triangle(s1,s2,s3);
        ass.setColor(c);
        ass.setFilled(filled);
        System.out.println("area: "+ass.getArea()+" perimeter: "+ass.getPerimeter()+
                "\ncolor: "+ass.getColor()+" filled: "+ass.isFilled());
    }
}

class GeometricObject{
    private String color = "white";
    private boolean filled;
    private Date dateCreated;
    public GeometricObject(){
        dateCreated=new Date();
    }
    public GeometricObject(String color,boolean filled){
        dateCreated=new Date();
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return "created on "+dateCreated+"\ncolor: "+color+
                " and filled: "+filled;
    }
}

class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(){
        super();
        side1=side2=side3=1;
    }
    public Triangle(double s1,double s2,double s3){
        super();
        side1=s1;
        side2=s2;
        side3=s3;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        double p=(side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString(){
        return "Triangle: side1 = "+side1+" side2 = "+side2+" side3 = "+side3;
    }
}
