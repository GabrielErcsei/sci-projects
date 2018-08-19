package ro.sciit.oop.homework2;

public class SmartSecurityCamera implements ElectricityConsumer {

    private static float camera_consumption = 25.0F;
    private boolean isFilming;
    private boolean isOn;
    private String state;
    private String filmState;


    public void turnOn(boolean on) {
        this.isOn = on;
        this.state = "On";
        System.out.println("Turning camera on..");
    }

    public void turnOff(boolean off) {
        if (!off) {
            this.isOn = off;
            this.state = "Off";
            System.out.println("Turning camera off..");
        }

    }

    public void startFilming(boolean start) {
        this.isFilming = true;
        this.filmState = this.filmState + "Camera is filming...";
        System.out.println("Starting filming...");
    }

    public void stopFilming(boolean stop) {
        if (!stop) {
            this.isFilming = stop;
            this.filmState = this.filmState + "Camera is not filming...";
            System.out.println("Stopping filming...");
        }

    }

    /**
     *
     * @return camera_consumption if boolean isOn = true, otherwise returns 0
     */
    public float calculateConsumption() {
        return this.isOn && this.isFilming ? camera_consumption : 0.0F;
    }

    /**
     * prints camera state
     */
    public void getState() {
        System.out.println("Current camera state is " + this.state);
    }
}
