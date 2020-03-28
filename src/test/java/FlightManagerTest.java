import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    private Plane plane;
    private Flight flight;
    private Passenger passenger;
    private FlightManager flightManager;

    @Before
    public void setUp(){
        plane= new Plane(PlaneType.AIRBUS_A319);
        flight= new Flight(plane,"FR756","22.00",
                DestinationsType.GLA,DestinationsType.ATH);
        passenger=new Passenger("Vasilis",2);
        flightManager= new FlightManager();
    }

    @Test
    public void getWeightPerPassengerForAFlight(){
        assertEquals(262,flightManager.weightReservedForEachPassenger(flight));
    }

}
