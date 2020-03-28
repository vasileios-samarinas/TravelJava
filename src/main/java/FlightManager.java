import java.util.ArrayList;

public class FlightManager {





    public int weightReservedForEachPassenger(Flight flight ) {
        Plane plane= flight.getPlane();
        return plane.getNetWeightForLuggages()/plane.getCapacity();
    }

    public int weightBookedByPassengerForFlight(Flight flight) {
        int totalWeight=0;
        Plane plane=flight.getPlane();
        ArrayList<Passenger>passengers=flight.getAllPassengers();
        for(Passenger passenger:passengers){
            if(weightReservedForEachPassenger(flight)>=passenger.totalWeightOfLuggagesPerPerson())
            totalWeight+=passenger.totalWeightOfLuggagesPerPerson();
        }
        return totalWeight;
    }
}
