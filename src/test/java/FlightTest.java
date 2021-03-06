import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger;

    @Before
    public void setUp(){
        plane=new Plane(PlaneType.AIRBUS_A319);
        flight= new Flight(plane,"FR756", new Date(1585486972),
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
        assertEquals(flight,passenger.getFlight());
    }

    @Test
    public void cannotBookPassenger(){
        Plane miniPlane= new Plane(PlaneType.MINI_PLANE);
        Flight miniFlight=new Flight(miniPlane,"AA0",new Date( 1585486972),DestinationsType.GLA,DestinationsType.ATH);
        miniFlight.addPassenger(passenger);
        miniFlight.addPassenger(passenger);
        assertEquals(1, miniFlight.getNumberOfPassengers());
    }


}
