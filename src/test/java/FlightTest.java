import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;

    @Before
    public void setUp(){
        plane=new Plane(PlaneType.AIRBUS_A319);
        flight= new Flight(plane,"FR756","22.00",
                DestinationsType.GLA,DestinationsType.ATH);

    }

    @Test
    public void emptyPlane(){
        assertEquals(0,flight.getNumberOfPassengers());
    }

    @Test
    public void canGetAvailableSeats(){
        assertEquals(144,flight.getAvailableSeats());
    }

}
