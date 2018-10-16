package ro.sciit.jdbc.homework;

public class RoomFair {

    private int id;
    private double value;

    public RoomFair(int id, double value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
