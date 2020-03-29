import java.util.Random;

public class Passenger {

    private String name;
    private int numberOfBags;
    Flight flight;
    private int bagWeight;
    private int seatNumber;


    public Passenger(String name, int numberOfBags){
        this.name=name;
        this.numberOfBags=numberOfBags;
        this.bagWeight=20;
        this.seatNumber=0;
    }


    public void addFlight(Flight flight) {
        this.flight=flight;
    }


    public Flight getFlight() {
        return this.flight;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }

    public int totalWeightOfLuggagesPerPerson() {
        return this.numberOfBags*this.bagWeight;
    }

    //    https://mkyong.com/java/java-generate-random-integers-in-a-range/?fbclid=IwAR0wFXMFZsPJnzu0upeZKCfmzLxo5UnphQRzFWIB35xZuPivAcYnPMjmnu0
//      To get random number between two values
//      Random r = new Random();
//		return r.nextInt((max - min) + 1) + min;
    public void getSeat(int max) {
        Random r = new Random();
        this.seatNumber=r.nextInt((max - 1) + 1) + 1;
    }



}
