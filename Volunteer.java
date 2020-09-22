public class Volunteer
{
    private String name;
    private double hours;
    private StopWatch watch;
    public Volunteer(String n, double h)
    {
        name = n;
        hours = h;
        watch = new StopWatch();
    }
    public String getName()
    {
        return name;
    }
    public double getHours()
    {
        return hours;
    }
    public StopWatch getStopWatch()
    {
        return watch;
    }
    public void startStopWatch()
    {
        watch.start();
    }
    public void stopStopWatch()
    {
        watch.stop();
    }
    public void setHours()
    {
        hours = watch.getElapsedHours();
    }
}