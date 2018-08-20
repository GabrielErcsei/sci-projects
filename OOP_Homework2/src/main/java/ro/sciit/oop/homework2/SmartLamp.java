package ro.sciit.oop.homework2;

public class SmartLamp implements ElectricityConsumer {
    /**
     * boolean isOn - stores lamp state
     * int brightness - stores lamp brightness\
     * float lamp_consumption - stores consumption value
     */
    private static float lamp_consumption = 15;
    private boolean isOn;
    private int brightness;
    private String color;
    private String state;



    public void setColor(String color) {
        this.color = color;
    }

    public void turnOn(boolean on){
        isOn = on;
        state = "On";
        System.out.println("Turning lamp on..");
    }


    public void turnOff(boolean off){
        if(off == false) {
            isOn = off;
            state = "Off";
            System.out.println("Turning lamp off..");
        }

    }

    /**
     *
     * @param brightness sets a value for brightness and stores it
     * @return
     */

    public int modifyBrightness(int brightness) {
        brightness = 0;
        if(brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println("Incorrect value.");
        }
        return brightness;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }

    /**
     * gets consumption
     * @return lamp_consumption if the lamp isOn, otherwise returns 0
     */
    public float calculateConsumption() {
        return isOn ? lamp_consumption : 0;
    }

    /**
     * prints lamp state
     */
    public void getState() {
        System.out.println("The current lamp state is " + state);
    }



}
