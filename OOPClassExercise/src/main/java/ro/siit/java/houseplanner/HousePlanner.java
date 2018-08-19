package ro.siit.java.houseplanner;

public class HousePlanner implements Valuable{

    private Floor [] floors = new Floor[5];
    private int floorCount = 0;

    public void addFloor(Floor floor) {
        floors[floorCount++] = floor;
    }

    public float calculateCost() {
        int cost = 0;
        for(Floor f : floors) {
            cost += f.calculateCost();
        }
        return cost;
    }
}
