public class Plane {

    private PlaneType planeType;


    public Plane(PlaneType planeType) {this.planeType=planeType;}


    public int getCapacity(){
        return this.planeType.capacity;
    }

    public int getWeight(){
        return this.planeType.weight;
    }


}
