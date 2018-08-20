package ro.siit.java.houseplanner;

public class Room implements Valuable{
    private Valuable [] roomObjects = new Valuable[100];
    private int roomObjCount = 0;

    public void addWindow(Window window) {
        roomObjects[roomObjCount++] = window;
    }

    public

    public float calculateCost() {
        int cost = 0;
        for(Valuable v : roomObjects) {
            cost += v.calculateCost();
        }
        return cost;
    }

}
