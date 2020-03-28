public enum PlaneType {

    AIRBUS_A319(144,75500),
    AIRBUS_A320(174,73500),
    AIRBUS_A321(201,89000);

    public final int capacity;
    public final int weight;

    PlaneType(int capacity,int weight){
        this.capacity=capacity;
        this.weight=weight;
    }





}
