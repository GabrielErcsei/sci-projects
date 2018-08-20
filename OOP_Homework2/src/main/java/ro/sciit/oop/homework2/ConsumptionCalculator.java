package ro.sciit.oop.homework2;

public class ConsumptionCalculator  {
    /**
     * method that calculates the consumption of all the instantiated objects
     * searches through the array and get the consumption value of the devices
     * float totalConsumption - stores the total consumption of the devices
     * @return the total consumption
     */
    public static float calculateConsumption(ElectricityConsumer [] consumers){
        float consumption = 0;
        for(ElectricityConsumer ec : consumers){
            if(ec != null) {
                consumption += ec.calculateConsumption();
            }
        }
        return consumption;
    }

}
