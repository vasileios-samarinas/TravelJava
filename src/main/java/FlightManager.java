public class FlightManager {




    public int weightReservedForEachPassenger(Flight flight ) {
        Plane plane= flight.getPlane();
        return plane.getNetWeightForLuggages()/plane.getCapacity();
    }
}
