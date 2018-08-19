package ro.sciit.oop.homework2;

public class SmartThermostat implements ElectricityConsumer {
    private static float thermo_consumption = 10.0F;
    private boolean isOn;
    private String state;
    private int temperature;

    public SmartThermostat() {
    }

    public void setTemperature(int temperature) {
        if (temperature >= 0 && temperature < 35) {
            this.temperature = temperature;
        } else {
            System.out.println("Incorrect value...");
        }

    }

    public int getTemperature() {
        return this.temperature;
    }

    public void turnOn(boolean on) {
        this.isOn = on;
        this.state = "On";
        System.out.println("Turning thermostat on..");
    }

    public void turnOff(boolean off) {
        if (!off) {
            this.isOn = off;
            this.state = "Off";
            System.out.println("Turning thermostat off..");
        }

    }

    public float calculateConsumption() {
        return this.isOn ? thermo_consumption : 0.0F;
    }

    public void getState() {
        System.out.println("The current thermostat state is " + this.state);
    }
}
