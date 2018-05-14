/*
 * Author: Gavin Uhran
 * Created: March 19, 2018
 * Updated: March 19, 2018
*/

public class Time
{
    private int hours;
    private int minutes;
    
    //Constructor
    public Time (int h, int m)
    {
        hours = h;
        minutes = m;
    }
    
    //Sets time to the parameters input
    public void setTime (int h, int m)
    {
        hours = h;
        minutes = m;
    }  
    
    //Returns current hours
    public int getHours()
    {
        return hours;
    }
    
    //Returns current minutes
    public int getMinutes()
    {
        return minutes;
    }
    
    //Returns true if hours is between 0 and 23 and minutes is between 0 and 59. Returns false otherwise
    public boolean isValidTime()
    {
        return hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60;
    }
    
    //Returns the current time as a String
    public String toString()
    {
        if (hours < 10 && minutes < 10)
            return "0" + hours + ":0" + minutes;
        else if (hours < 10)
            return "0" + hours + ":" + minutes;
        else if (minutes < 10)
            return hours + ":0" + minutes;
        else 
            return hours + ":" + minutes;
    }
    
    //Returns the minutes between the parameter time and the instantiated time
    public int minutesUntil (Time other)
    {
        int currentMinutes = (this.getHours() * 60) + this.getMinutes();
        int otherMinutes = (other.getHours() * 60) + other.getMinutes();
        return otherMinutes - currentMinutes;
    }
}
