package ro.siit.java.houseplanner;

public class Main {

    public static void main(String[] args) {
        HousePlanner planner = new HousePlanner();
        Floor floor = new Floor();
        planner.addFloor(floor);
        float price = planner.calculateCost();
    }
}
