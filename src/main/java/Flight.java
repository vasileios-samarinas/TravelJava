import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger>passengers;
    private Plane plane;
    private String flightNumber;
    private Date departureTime;
    private DestinationsType destinationAirport;
    private DestinationsType departuresAirport;


    public Flight(Plane plane,String flightNumber,Date departureTime,DestinationsType destinationAirport,DestinationsType departuresAirport){
        this.plane=plane;
        this.flightNumber=flightNumber;
        this.departureTime=departureTime;
        this.passengers=new ArrayList<Passenger>();
        this.destinationAirport=destinationAirport;
        this.departuresAirport=departuresAirport;
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public Plane getPlane()
    {return this.plane;}


    public int getAvailableSeats() {
        return this.plane.getCapacity()-this.getNumberOfPassengers();
    }


    public void addPassenger(Passenger passenger) {
        if(this.getAvailableSeats()==0)
        {return;}
        passengers.add(passenger);
        passenger.addFlight(this);
    }

    public ArrayList<Passenger> getAllPassengers(){
        return this.passengers;
    }
}
