/*
 * Author: Gavin Uhran
 * Created: March 19, 2018
 * Updated: March 19, 2018
*/

public class Flight
{
    private String flightNumber;
    private Time departureTime;
    private Time arrivalTime;
    
    //Constructor
    public Flight (String fN, Time dT, Time aT)
    {
        flightNumber = fN;
        departureTime = dT;
        arrivalTime = aT;
    }
    
    //Sets flight to the parameters input
    public void setFlight(String fN, Time dT, Time aT)
    {
        flightNumber = fN;
        departureTime = dT;
        arrivalTime = aT;
    }
    
    //Returns departure time
    public Time getDepartureTime()
    {
        return departureTime;
    }
    
    //Returns arrival time
    public Time getArrivalTime()
    {
        return arrivalTime;
    }
    
    //Returns a description of the flight as a String
    public String toString()
    {
        return "Flight Number: " + flightNumber + "\nDepartureTime: " + departureTime.toString() + "\nArrivalTime: " + arrivalTime.toString() + "\nFlight Length: " + departureTime.minutesUntil(arrivalTime) + " minutes";
    }
}
