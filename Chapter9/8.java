public class book {
    public static void main(String[] args)
    {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}

class Fan
{
    final static int SLOW=1;
    final static int MEDIUM=2;
    final static int FAST=3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color="blue";
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int s){
        speed=s;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean j){
        on=j;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius=r;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String s){
        color=s;
    }
    public Fan(){
        speed=SLOW;
        on=false;
        radius=5;
        color="blue";
    }
    public String toString(){
        String re="";
        if(this.on)
            re=re+speed+" "+color+" "+radius;
        else
            re=re+"fan is off "+color+" "+radius;
        return re;
    }
}