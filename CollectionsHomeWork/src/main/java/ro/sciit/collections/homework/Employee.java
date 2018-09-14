package ro.sciit.collections.homework;

public class Employee implements Comparable<Employee> {

    private String firstName;
    private String lastName;
    private String title;
    private boolean parkingSpace;
    private int seniority;

    public Employee(String firstName, String lastName, String title, boolean parkingSpace, int seniority) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.parkingSpace = parkingSpace;
        this.seniority = seniority;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isParkingSpace() {
        return parkingSpace;
    }

    public int getSeniority() {
        return seniority;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", parkingSpace=" + parkingSpace +
                ", seniority=" + seniority +
                '}';
    }

    public int compareTo(Employee o) {
        Integer i = o.getSeniority();
        return i.compareTo(o.getSeniority());
    }
}
