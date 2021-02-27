public class book {
    public static void main(String[] args)
    {
        StopWatch timer = new StopWatch();
        //selection sort
        timer.stop();
        System.out.println(timer.getElapsedTime());
    }
}

class StopWatch
{
    private long startTime;
    private long endTime;
    StopWatch()
    {
        this.startTime=System.currentTimeMillis();
    }
    public void start()
    {
        this.startTime=System.currentTimeMillis();
    }
    public void stop()
    {
        this.endTime=System.currentTimeMillis();
    }
    public long getElapsedTime()
    {
        return this.endTime-this.startTime;
    }
}