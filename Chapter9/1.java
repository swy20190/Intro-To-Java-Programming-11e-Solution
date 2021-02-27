public class book {
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);
        System.out.println("R1 "+r1.getWidth()+" "+r1.getHeight()+" "+r1.getArea()+" "+r1.getPerimeter());
        System.out.println("R2 "+r2.getWidth()+" "+r2.getHeight()+" "+r2.getArea()+" "+r2.getPerimeter());
    }
}

class Rectangle{
    private double width;
    private double height;
    public Rectangle(double w, double h)
    {
        this.width=w;
        this.height=h;
    }
    public Rectangle()
    {
        this(1,1);
    }
    public double getArea()
    {
        return width*height;
    }
    public double getPerimeter()
    {
        return 2*(width+height);
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
}