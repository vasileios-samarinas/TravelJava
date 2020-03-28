import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger>passengers;
    private Plane plane;
    private String flightNumber;
    private String departureTime;
    private DestinationsType destinationAirport;
    private DestinationsType departuresAirport;

    public Flight(Plane plane,String flightNumber,String departureTime,DestinationsType destinationAirport,DestinationsType departuresAirport){
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


    public int getAvailableSeats() {
        return this.plane.getCapacity()-this.getNumberOfPassengers();
    }


    public void addPassenger(Passenger passenger) {
        if(this.getAvailableSeats()==0)
        {return;}
        passengers.add(passenger);
    }
}
