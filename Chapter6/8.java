public class book {
    public static void main(String[] args)
    {
        System.out.println("摄氏度\t华氏度\t\t华氏度\t摄氏度");
        System.out.println("------------------------------------");
        for(int i=0;i<10;i++)
            System.out.printf("3.1f\t%.1f\t\t%.1f\t.2f\n",(40.0-i),CF.celsiusToFahrenheit(40.0-i),(120.0-10.0*i),CF.fahrenheitToCelsius(120.0-10.0*i));
    }

}

class CF{
    public static double celsiusToFahrenheit(double celsius)
    {
        return (9.0/5)*celsius+32;
    }
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (5.0/9)*(fahrenheit-32);
    }
}
