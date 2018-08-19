package ro.sciit.oop.homework2;

public class ConsumptionCalculator {
    public ConsumptionCalculator() {
    }

    public static float calculateConsumption(ElectricityConsumer[] consumers) {
        float consumption = 0.0F;

        for(ElectricityConsumer ec : consumers) {
            if (ec != null) {
                consumption += ec.calculateConsumption();
            }
        }

        return consumption;
    }
}
