import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger;

    @Before
    public void setUp(){
        plane=new Plane(PlaneType.AIRBUS_A319);
        flight= new Flight(plane,"FR756","22.00",
                DestinationsType.GLA,DestinationsType.ATH);
        passenger= new Passenger("Valia",1);

    }

    @Test
    public void emptyPlane(){
        assertEquals(0,flight.getNumberOfPassengers());
    }

    @Test
    public void canGetAvailableSeats(){
        assertEquals(144,flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1,flight.getNumberOfPassengers());
    }

    @Test
    public void cannotBookPassenger(){
        Plane miniPlane= new Plane(PlaneType.MINI_PLANE);
        Flight miniflight=new Flight(miniPlane,"AA0","12:00",DestinationsType.GLA,DestinationsType.ATH);
        miniflight.addPassenger(passenger);
        miniflight.addPassenger(passenger);
        assertEquals(1, miniflight.getNumberOfPassengers());
    }



}
