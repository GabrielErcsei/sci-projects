package ro.sciit.oop.homework2;

public class SmartLamp implements ElectricityConsumer {
    private static float lamp_consumption = 15.0F;
    private boolean isOn;
    private int brightness;
    private String color;
    private String state;

    public SmartLamp() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void turnOn(boolean on) {
        this.isOn = on;
        this.state = "On";
        System.out.println("Turning lamp on..");
    }

    public void turnOff(boolean off) {
        if (!off) {
            this.isOn = off;
            this.state = "Off";
            System.out.println("Turning lamp off..");
        }

    }

    public int modifyBrightness(int brightness) {
        brightness = 0;
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println("Incorrect value.");
        }

        return brightness;
    }

    public int getBrightness() {
        return this.brightness;
    }

    public String getColor() {
        return this.color;
    }

    public float calculateConsumption() {
        return this.isOn ? lamp_consumption : 0.0F;
    }

    public void getState() {
        System.out.println("The current lamp state is " + this.state);
    }
}
