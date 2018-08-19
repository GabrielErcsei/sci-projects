package ro.sciit.oop.homework2;

public class Main {
    public static void main(String[] args) {
        Host host = new Host();
        host.turnLampsOff();
        host.turnLampsOn();
        host.turnCamerasOn();
        host.startFilming();
        host.getLampState();
        host.turnThermostatsOn();
        host.getConsumers();
        float consumption = host.calculateConsumption();
        System.out.println(consumption + " KW/h");
    }
}