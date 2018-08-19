package ro.sciit.oop.homework2;

public class SmartSecurityCamera implements ElectricityConsumer {
    private static float camera_consumption = 25;
    private boolean isFilming;
    private boolean isOn;
    private String state;
    private String filmState;


    public void turnOn(boolean on){
        isOn = on;
        state = "On";
        System.out.println("Turning camera on..");
    }


    public void turnOff(boolean off){
        if(off == false) {
            isOn = off;
            state = "Off";
            System.out.println("Turning camera off..");
        }

    }

    public void startFilming(boolean start) {
        isFilming = true;
        filmState += "Camera is filming...";
        System.out.println("Starting filming...");
    }

    public void stopFilming(boolean stop) {
        if(stop == false) {
            isFilming = stop;
            filmState += "Camera is not filming...";
            System.out.println("Stopping filming...");
        }

    }
    /**
     * gets consumption
     * @return camera_consumption if the camera isOn, otherwise returns 0
     */
    public float calculateConsumption() {
        return isOn && isFilming ? camera_consumption : 0;
    }

    /**
     * prints camera state
     */
    public void getState() {
        System.out.println(filmState);
        System.out.println("Current camera state is " + state);
    }

}
