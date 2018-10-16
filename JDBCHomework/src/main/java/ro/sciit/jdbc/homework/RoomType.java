package ro.sciit.jdbc.homework;

public class RoomType {

    private String name;
    private int area;

    public RoomType(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }
}
