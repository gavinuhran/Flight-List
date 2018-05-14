/*
 * Author: Gavin Uhran
 * Created: March 19, 2018
 * Updated: March 19, 2018
*/

import java.util.*;

public class Trip
{
    private String trip;
    private List<Flight> flights;
    
    //Constructor
    public Trip (String t, List<Flight> f)
    {
        trip = t;
        flights = f;
    }
    
    //Returns the number of minutes between the departure time of the first flight and the arrival time of the last flight. Returns 0 if there are no flights.
    public int getDuration()
    {
        if (flights.size() == 0)
            return 0;
        else
            return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size() - 1).getArrivalTime());
    }
    
    //Returns the smallest difference between consecutive flights arrival time of the first and departure time of the second. Returns -1 if there is 1 or less flights
    public int getShortestLayover() //CHECK FOR FLIGHTS.SIZE() <= 1
    {
        if (flights.size() <= 1)
            return -1;
        else 
        {
            int shortestLayover = flights.get(0).getArrivalTime().minutesUntil(flights.get(flights.size() - 1).getDepartureTime());
            for (int i = 1; i < flights.size() - 1; i++)
                if (flights.get(i).getArrivalTime().minutesUntil(flights.get(i + 1).getDepartureTime()) < shortestLayover)
                    shortestLayover =  flights.get(i).getArrivalTime().minutesUntil(flights.get(i + 1).getDepartureTime());
            return shortestLayover;
        }
    }
    
    public String toString() 
    { 
        String t = "The " + trip + " trip itinerary is as follows:\n\n"; 
        for (int i = 0; i < flights.size(); i++) 
        { 
            t += flights.get(i); 
            if (i < flights.size() - 1) 
            { 
                t += "\nThe layover between flights is "; 
                t += flights.get(i).getArrivalTime().minutesUntil(flights.get(i + 1).getDepartureTime()); 
                t += " minutes\n\n"; 
            } 
        } 
        t += "\nThe duration of the entire trip is " + getDuration() + " minutes\n"; 
        t += "The shortest layover is " + getShortestLayover() + " minutes"; 
        return t; 
    }
}
