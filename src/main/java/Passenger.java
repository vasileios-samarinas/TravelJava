public class Passenger {

    private String name;
    private int numberOfBags;
    Flight flight;

    public Passenger(String name, int numberOfBags){
        this.name=name;
        this.numberOfBags=numberOfBags;
    }


    public void addFlight(Flight flight) {
        this.flight=flight;
    }

    public Flight getFlight() {
        return this.flight;
    }
}
