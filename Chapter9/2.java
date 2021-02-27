public class book {
    public static void main(String[] args)
    {
        Stock s = new Stock("ORCL","Oracle Corporation");
        s.setPreviousClosingPrice(34.5);
        s.setCurrentPrice(34.35);
        System.out.println("The change percent is "+s.getChangePercent()+"%");
    }
}

class Stock
{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    Stock(String symbol,String name)
    {
        this.symbol=symbol;
        this.name=name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    public void setCurrentPrice(double p)
    {
        this.currentPrice=p;
    }
    public double getChangePercent()
    {
        return (currentPrice-previousClosingPrice)/previousClosingPrice*100;
    }
}