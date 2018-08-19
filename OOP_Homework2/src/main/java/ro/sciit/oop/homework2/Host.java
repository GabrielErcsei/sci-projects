package ro.sciit.oop.homework2;

public class Host{

    /**
     * consumers - an array of new consumers
     * consumerCount  - variable that stores consumers
     */
    private ElectricityConsumer [] consumers = new ElectricityConsumer[100];
    private int consumerCount = 0;


    /**
     * Constructor initializes a number of smart devices and assigns them to a position in the array
     */
    public Host () {
        consumers[0] = new SmartLamp();
        consumers[1] = new SmartSecurityCamera();
        consumers[2] = new SmartThermostat();
        consumers[3] = new SmartThermostat();
        consumers[4] = new SmartLamp();
        consumers[5] = new SmartLamp();
        consumers[6] = new SmartLamp();
        consumers[7] = new SmartSecurityCamera();
    }


    /**
     * print the array
     */
    public void  getConsumers() {
        System.out.println(consumers);
    }

    /**
     * method that turns all the initialised lamps on
     */
    public void turnLampsOn() {

        for(ElectricityConsumer sl : consumers) {
            if(sl != null && (sl instanceof SmartLamp)){
                ((SmartLamp) sl).turnOn(true);
            }
        }
    }

    /**
     * method that turns all the initialised lamps off
     */
    public void turnLampsOff() {

        for(ElectricityConsumer sl : consumers) {
            if(sl != null && (sl instanceof SmartLamp)){
                ((SmartLamp) sl).turnOff(false);
            }
        }
    }

    /**
     * method that turns all the initialised cameras on
     */
    public void turnCamerasOn() {
        for(ElectricityConsumer sc : consumers) {
            if(sc != null && (sc instanceof SmartSecurityCamera)){
                ((SmartSecurityCamera) sc).turnOn(true);
            }
        }
    }

    /**
     * method that turns all the initialised cameras off
     */
    public void turnCamerasOff() {
        for(ElectricityConsumer sc : consumers) {
            if(sc != null && (sc instanceof SmartSecurityCamera)){
                ((SmartSecurityCamera) sc).turnOff(false);
            }
        }
    }

    /**
     * method that starts filming
     */
    public void startFilming() {
        for(ElectricityConsumer sc : consumers) {
            if(sc != null && (sc instanceof SmartSecurityCamera)){
                ((SmartSecurityCamera) sc).startFilming(true);
            }
        }
    }

    /**
     * method that stops filming
     */
    public void stopFilming() {
        for(ElectricityConsumer sc : consumers) {
            if(sc != null && (sc instanceof SmartSecurityCamera)){
                ((SmartSecurityCamera) sc).stopFilming(false);
            }
        }
    }

    /**
     * method that turns all the initialised thermostats on
     */
    public void turnThermostatsOn() {
        for(ElectricityConsumer st : consumers) {
            if(st != null && (st instanceof SmartThermostat)){
                ((SmartThermostat) st).turnOn(true);
            }
        }
    }

    /**
     * method that turns all the initialised thermostats off
     */
    public void turnThermostatsOff() {
        for(ElectricityConsumer st : consumers) {
            if(st != null && (st instanceof SmartThermostat)){
                ((SmartThermostat) st).turnOff(false);
            }
        }
    }

    /**
     * prints lamp state
     */
    public void getLampState() {
        for(ElectricityConsumer sl : consumers) {
            if(sl instanceof SmartLamp){
                ((SmartLamp) sl).getState();
            }
        }
    }

    /**
     * prints camera state
     */
    public void getCameraState() {
        for(ElectricityConsumer sc : consumers) {
            if(sc instanceof SmartSecurityCamera){
                ((SmartSecurityCamera) sc).getState();
            }
        }
    }

    /**
     * prints thermostat state
     */
    public void getThermostatState() {
        for(ElectricityConsumer st : consumers) {
            if(st instanceof SmartThermostat){
                ((SmartThermostat) st).getState();
            }
        }
    }

    /**
     * method that calculates the consumption of all the instantiated objects
     * searches through the array and get the consumption value of the devices
     * float totalConsumption - stores the total consumption of the devices
     * @return the total consumption
     */
    public float calculateConsumption() {
        float totalConsumption = 0;
        for(ElectricityConsumer ec : consumers) {
            if(ec != null){
                totalConsumption =+ ConsumptionCalculator.calculateConsumption(consumers);
            }
        }
        return totalConsumption;
    }
}
