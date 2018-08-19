package ro.sciit.oop.homework2;

public class Host {
    private ElectricityConsumer[] consumers = new ElectricityConsumer[100];

    public Host() {
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
     * prints the consumers in the array
     */
    public void getConsumers() {
        System.out.println(consumers);
    }

    public void turnLampsOn() {

        for(ElectricityConsumer sl : consumers) {
            if (sl instanceof SmartLamp) {
                ((SmartLamp)sl).turnOn(true);
            }
        }

    }

    public void turnLampsOff() {
        for(ElectricityConsumer sl : consumers) {
            if (sl instanceof SmartLamp) {
                ((SmartLamp)sl).turnOff(false);
            }
        }

    }

    public void turnCamerasOn() {
        for(ElectricityConsumer sc : consumers) {
            if (sc instanceof SmartSecurityCamera) {
                ((SmartSecurityCamera)sc).turnOn(true);
            }
        }
    }

    public void turnCamerasOff() {
        for(ElectricityConsumer sc : consumers) {
            if ( sc instanceof SmartSecurityCamera) {
                ((SmartSecurityCamera)sc).turnOff(false);
            }
        }

    }

    /**
     * Starts the filming of all camera objects
     */
    public void startFilming() {
        for(ElectricityConsumer sc : consumers) {
            if (sc instanceof SmartSecurityCamera) {
                ((SmartSecurityCamera)sc).startFilming(true);
            }
        }

    }

    /**
     * Stops the filming of all camera objects
     */
    public void stopFilming() {
        for(ElectricityConsumer sc : consumers) {
            if (sc instanceof SmartSecurityCamera) {
                ((SmartSecurityCamera)sc).stopFilming(false);
            }
        }

    }

    public void turnThermostatsOn() {
        for(ElectricityConsumer st : consumers) {
            if (st instanceof SmartThermostat) {
                ((SmartThermostat)st).turnOn(true);
            }
        }

    }

    public void turnThermostatsOff() {
        for(ElectricityConsumer st : consumers) {
            if (st instanceof SmartThermostat) {
                ((SmartThermostat)st).turnOff(false);
            }
        }

    }

    /**
     * checks array an returns the state of SmartLamp objects in the array
     */
    public void getLampState() {
        for(ElectricityConsumer sl : consumers) {
            if (sl instanceof SmartLamp) {
                ((SmartLamp)sl).getState();
            }
        }

    }

    /**
     * checks array an returns the state of SmartCamera objects in the array
     */
    public void getCameraState() {
        for(ElectricityConsumer sc : consumers) {
            if (sc instanceof SmartSecurityCamera) {
                ((SmartSecurityCamera)sc).getState();
            }
        }
    }

    /**
     * checks array an returns the state of SmartThermostat objects in the array
     */
    public void getThermostatState() {
        for(ElectricityConsumer st : consumers) {
            if (st instanceof SmartThermostat) {
                ((SmartThermostat)st).getState();
            }
        }

    }

    /**
     * float totalConsumption stores the consumption value for all the devices in the array
     * @return the value
     */
    public float calculateConsumption() {
        float totalConsumption = 0.0F;
        for(ElectricityConsumer ec : consumers) {
            if (ec != null) {
                totalConsumption = ConsumptionCalculator.calculateConsumption(consumers);
            }
        }
        return totalConsumption;
    }
}
