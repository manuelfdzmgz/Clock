
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private int hour;
    private int minute;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay(int hours, int minutes)
    {
        // initialise instance variables
        hour = hours;
        minute = minutes;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setTime()
    {
        hour = 23;
        minute = 45;
        
      
    }
    public void  timeTick()
    {   
        hour = hour +1;
        minute = minute;
    }
    public String getTime()
    {   String character = ":";
        String completeHour = (hour) + character + (minute);
        return completeHour;
    }
}
