package ro.sciit.iohomework;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Class Main contains a single method main().
 * Used to create file references and instantiate objects (SalesReader, SalesStatistics, StatisticExporter)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //create a reference to the file and reader
        File file = new File("E:\\CursJava\\sci\\IOHomework\\customer-products.csv");
        SalesReader salesReader = new SalesReader();

        //creates list for storing the sales
        List<Sale> salesAsObjects = salesReader.getSalesAsObjects(salesReader.getSalesAsStrings(file));
        SalesStatistics salesStatistic = new SalesStatistics();

        //Iterates through the list and adds it to the statistics
        for (Sale sale : salesAsObjects) {
            salesStatistic.addSale(sale);
        }

        StatisticsExporter statisticsExporter = new StatisticsExporter();
        statisticsExporter.writeStatsToFile(salesStatistic);
    }
}