package ro.sciit.oop.homework2;

public class Host {
    private ElectricityConsumer[] consumers = new ElectricityConsumer[100];
    private int consumerCount = 0;

    public Host() {
        this.consumers[0] = new SmartLamp();
        this.consumers[1] = new SmartSecurityCamera();
        this.consumers[2] = new SmartThermostat();
        this.consumers[3] = new SmartThermostat();
        this.consumers[4] = new SmartLamp();
        this.consumers[5] = new SmartLamp();
        this.consumers[6] = new SmartLamp();
        this.consumers[7] = new SmartSecurityCamera();
    }

    public void getConsumers() {
        System.out.println(consumers);
    }

    public void turnLampsOn() {
        ElectricityConsumer[] var1 = this.consumers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ElectricityConsumer sl = var1[var3];
            if (sl != null && sl instanceof SmartLamp) {
                ((SmartLamp)sl).turnOn(true);
            }
        }

    }

    public void turnLampsOff() {
        ElectricityConsumer[] var1 = this.consumers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ElectricityConsumer sl = var1[var3];
            if (sl != null && sl instanceof SmartLamp) {
                ((SmartLamp)sl).turnOff(false);
            }
        }

    }

    public void turnCamerasOn() {
        ElectricityConsumer[] var1 = this.consumers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ElectricityConsumer sc = var1[var3];
            if (sc != null && sc instanceof SmartSecurityCamera) {
                ((SmartSecurityCamera)sc).turnOn(true);
            }
        }

    }

    public void turnCamerasOff() {
        ElectricityConsumer[] var1 = this.consumers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ElectricityConsumer sc = var1[var3];
            if (sc != null && sc instanceof SmartSecurityCamera) {
                ((SmartSecurityCamera)sc).turnOff(false);
            }
        }

    }

    public void startFilming() {
        ElectricityConsumer[] var1 = this.consumers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ElectricityConsumer sc = var1[var3];
            if (sc != null && sc instanceof SmartSecurityCamera) {
                ((SmartSecurityCamera)sc).startFilming(true);
            }
        }

    }

    public void stopFilming() {
        ElectricityConsumer[] var1 = this.consumers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ElectricityConsumer sc = var1[var3];
            if (sc != null && sc instanceof SmartSecurityCamera) {
                ((SmartSecurityCamera)sc).stopFilming(false);
            }
        }

    }

    public void turnThermostatsOn() {
        ElectricityConsumer[] var1 = this.consumers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ElectricityConsumer st = var1[var3];
            if (st != null && st instanceof SmartThermostat) {
                ((SmartThermostat)st).turnOn(true);
            }
        }

    }

    public void turnThermostatsOff() {
        ElectricityConsumer[] var1 = this.consumers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ElectricityConsumer st = var1[var3];
            if (st != null && st instanceof SmartThermostat) {
                ((SmartThermostat)st).turnOff(false);
            }
        }

    }

    public void getLampState() {
        ElectricityConsumer[] var1 = this.consumers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ElectricityConsumer sl = var1[var3];
            if (sl instanceof SmartLamp) {
                ((SmartLamp)sl).getState();
            }
        }

    }

    public void geCameraState() {
        ElectricityConsumer[] var1 = this.consumers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ElectricityConsumer sc = var1[var3];
            if (sc instanceof SmartSecurityCamera) {
                ((SmartSecurityCamera)sc).getState();
            }
        }

    }

    public void getThermostatState() {
        ElectricityConsumer[] var1 = this.consumers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ElectricityConsumer st = var1[var3];
            if (st instanceof SmartThermostat) {
                ((SmartThermostat)st).getState();
            }
        }

    }

    public float calculateConsumption() {
        float totalConsumption = 0.0F;
        ElectricityConsumer[] var2 = this.consumers;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            ElectricityConsumer ec = var2[var4];
            if (ec != null) {
                totalConsumption = ConsumptionCalculator.calculateConsumption(this.consumers);
            }
        }

        return totalConsumption;
    }
}
