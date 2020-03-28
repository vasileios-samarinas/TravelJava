import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setUp(){
        plane= new Plane(PlaneType.AIRBUS_A319);
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(144,plane.getCapacity());
    }

    @Test
    public void getPlaneWeight(){
        assertEquals(75500,plane.getWeight());
    }

    @Test
    public void getWeightForLuggagesPerFlight(){
        assertEquals(37750,plane.getNetWeightForLuggages());
    }

}
