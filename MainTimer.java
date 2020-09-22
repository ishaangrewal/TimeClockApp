import java.util.*;
import java.lang.*;
public class MainTimer 
{
    private ArrayList<Volunteer> vols = new ArrayList<>();
    public static void main (String args[]) throws Exception
    {
        MainTimer n = new MainTimer();
        n.timer();
    }

    public void timer() 
    {
        Scanner console = new Scanner (System.in);
        int test = 0;
        while(test!=3)
        {
            test = 0;
            while(test!=1&&test!=2)
            {
                System.out.println("Press 1 to clock in 2 to clock out or 3 to end the program");
                test = console.nextInt();            
                if(test==3)
                {
                    break;
                }
                if (test!=1&&test!=2)
                {
                    System.out.println("Try Again!");
                }
            }
            if(test==3)
            {
                break;
            }
            console.nextLine();
            System.out.println("What is your full name?");
            String n = console.nextLine();
            if(test==1)
            {
                Volunteer v = new Volunteer(n, 0.0);
                v.startStopWatch();
                vols.add(v);            
            }
            else 
            {
                while(findInd(n)==-1)
                {
                    System.out.println("Try Again! What is your full name (should be the same as clock in)(not case sensitive)");
                    n = console.nextLine();
                }
                vols.get(findInd(n)).stopStopWatch();
                vols.get(findInd(n)).setHours();
            }
        }
        System.out.println("Name of volunteer       Hours Volunteered");
        for(int x = 0 ; x < vols.size(); x++)
        {
            System.out.println(vols.get(x).getName()+"       "+vols.get(x).getHours());
        }
    }

    public int findInd(String name)
    {
        for (int x = 0; x < vols.size() ; x++)
        {
            if((vols.get(x).getName()).equalsIgnoreCase(name))
            {
                return x;
            }
        }
        return -1;
    }
}