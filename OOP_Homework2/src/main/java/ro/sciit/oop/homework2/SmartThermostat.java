package ro.sciit.oop.homework2;

public class SmartThermostat implements ElectricityConsumer  {

    private static float thermo_consumption = 10;
    private boolean isOn;
    private String state;
    private int temperature;

    /**
     * int temperature - sets and stores the given value if it's between 0 and 35
     * @param temperature
     */
    public void setTemperature(int temperature) {
        if(temperature >= 0 && temperature < 35) {
            this.temperature = temperature;
        } else {
            System.out.println("Incorrect value...");
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void turnOn(boolean on){
        isOn = on;
        state = "On";
        System.out.println("Turning thermostat on..");
    }


    public void turnOff(boolean off){
        if(off == false) {
            isOn = off;
            state = "Off";
            System.out.println("Turning thermostat off..");
        }

    }
    /**
     * gets consumption
     * @return thermo_consumption if the thermostat isOn, otherwise returns 0
     */
    public float calculateConsumption() {
        return isOn ? thermo_consumption : 0;
    }

    /**
     * prints thermostat state
     */
    public void getState() {
        System.out.println("The current thermostat state is " + state);
    }


}
