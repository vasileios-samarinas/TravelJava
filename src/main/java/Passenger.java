public class Passenger {

    private String name;
    private int numberOfBags;
    Flight flight;
    private int bagWeight;

    public Passenger(String name, int numberOfBags){
        this.name=name;
        this.numberOfBags=numberOfBags;
        this.bagWeight=20;
    }


    public void addFlight(Flight flight) {
        this.flight=flight;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public int totalWeightOfLuggagesPerPerson() {
        return this.numberOfBags*this.bagWeight;
    }
}
