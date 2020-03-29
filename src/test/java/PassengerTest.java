import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Flight flight;
    private Plane plane;

    @Before
    public void setUp(){
        plane=new Plane(PlaneType.AIRBUS_A319);
        flight= new Flight(plane,"FR756",new Date(1585486972),
                DestinationsType.GLA,DestinationsType.ATH);
        passenger=new Passenger("Vasilis",2);

    }

    @Test
    public void setPassengerAddedToFlight(){
        passenger.addFlight(flight);
        assertEquals(flight,passenger.getFlight());
    }

    @Test
    public void getTotalWeightOfLuggages(){
        assertEquals(40,passenger.totalWeightOfLuggagesPerPerson());
    }


}
