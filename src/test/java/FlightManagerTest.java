import org.junit.Before;
import org.junit.Test;

public class FlightManagerTest {


    private Plane plane;
    private Flight flight;

    @Before
    public void setUp(){
        plane= new Plane(PlaneType.AIRBUS_A319);
        flight= new Flight(plane,"FR756","22.00",
                DestinationsType.GLA,DestinationsType.ATH);
    }



}
