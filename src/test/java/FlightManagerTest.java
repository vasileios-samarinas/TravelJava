import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    private Plane plane;
    private Flight flight;
    private Passenger passenger;
    private FlightManager flightManager;

    @Before
    public void setUp(){
        plane= new Plane(PlaneType.AIRBUS_A319);
        flight= new Flight(plane,"FR756",new Date(1585486972),
                DestinationsType.GLA,DestinationsType.ATH);
        passenger=new Passenger("Vasilis",2);
        flightManager= new FlightManager();
    }

    @Test
    public void getWeightPerPassengerForAFlight(){
        assertEquals(262,flightManager.weightReservedForEachPassenger(flight));
    }

    @Test
    public void getWeightBookedTotal(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(120,flightManager.weightBookedByPassengerForFlight(flight));
    }

    @Test
    public void getWeightReservedForBaggageRemainsForAFlight(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(37630,flightManager.weightReservedForBaggageRemaining(flight));

    }

}
