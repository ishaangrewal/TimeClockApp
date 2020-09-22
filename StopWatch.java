public class StopWatch
{
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;
    public void start()
    {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() 
    {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    //elapsed time in milliseconds
    public long getElapsedTime() 
    {
        long elapsed;
        if (running)
        {
            elapsed = (System.currentTimeMillis() - startTime);
        } 
        else
        {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }

    //elapsed time in seconds
    public long getElapsedTimeSecs() 
    {
        long elapsed;
        elapsed = (getElapsedTime()/1000);
        return elapsed;
    }

    public double getElapsedHours()
    {
        double h;
        h = ((double)getElapsedTimeSecs()/3600);
        return h;
    }
}