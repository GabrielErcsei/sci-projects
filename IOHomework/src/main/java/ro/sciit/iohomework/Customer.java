package ro.sciit.iohomework;

import java.util.Objects;

public class Customer {

    private String name;
    private int numberOfOrders;
    private double totalAmountSpent;

    /**
     *
     * @param name assigns a given string to the variable
     */
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders++;
    }

    public double getTotalAmountSpent() {
        return totalAmountSpent;
    }

    public void setTotalAmountSpent(double newAmountSpent) {
        this.totalAmountSpent += newAmountSpent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer client = (Customer) o;
        return getNumberOfOrders() == client.getNumberOfOrders() &&
                Double.compare(client.getTotalAmountSpent(), getTotalAmountSpent()) == 0 &&
                Objects.equals(getName(), client.getName());
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 21 * result + getNumberOfOrders();
        result = (int) (21 * result + getTotalAmountSpent());
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", numberOfOrders=" + numberOfOrders +
                ", totalAmountSpent=" + totalAmountSpent +
                '}';
    }
}
