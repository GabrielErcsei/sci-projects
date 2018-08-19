package ro.siit.java.houseplanner;

public class Floor {

    private Room [] rooms = new Room[10];


    public float calculateCost() {
        int cost = 0;
        for(Room r : rooms) {
            cost += r.calculateCost();
        }
        return cost;
    }

}
