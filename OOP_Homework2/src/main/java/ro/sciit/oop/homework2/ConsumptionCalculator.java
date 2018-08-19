package ro.sciit.oop.homework2;

public class ConsumptionCalculator {
    public ConsumptionCalculator() {
    }

    public static float calculateConsumption(ElectricityConsumer[] consumers) {
        float consumption = 0.0F;
        ElectricityConsumer[] var2 = consumers;
        int var3 = consumers.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            ElectricityConsumer ec = var2[var4];
            if (ec != null) {
                consumption += ec.calculateConsumption();
            }
        }

        return consumption;
    }
}
