package ro.sciit.iohomework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StatisticsExporter {

    /**
     * @param salesStatistic provides results exported in a file
     * @throws IOException
     */
    public void writeStatsToFile(SalesStatistics salesStatistic) throws IOException {

        File f = new File("E:\\CursJava\\sci\\IOHomework\\salesStatistics.txt");
        if (f.exists()) {
            f.delete();
        } else {
            f.createNewFile();
        }

        String nl = System.getProperty("line.separator");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            List<Product> products = salesStatistic.getProductStatistics(salesStatistic.getProductsHashMap());
            bw.append("Best selling products" + nl);
            for (int i = 0; i < products.size(); i++) {
                bw.append((i + 1) + ". " + products.get(i).getProductName() + " - " +
                        products.get(i).getUnitsSold() + " units");
                bw.newLine();
            }
            bw.append("...");
        }

        try (BufferedWriter bw1 = new BufferedWriter(new FileWriter(f, true))) {
            List<Customer> customers = salesStatistic.getClientStatisticsByOrderAmount();
            bw1.append(nl + "Top Returning Customers" + nl);
            for (int i = 0; i < customers.size(); i++) {
                bw1.append((i + 1) + ". " + customers.get(i).getName() + "  -  " +
                        customers.get(i).getNumberOfOrders() + " orders");
                bw1.newLine();
            }
            bw1.append("...");
        }

        try (BufferedWriter bw2 = new BufferedWriter(new FileWriter(f, true))) {
            List<Customer> clients = salesStatistic.getClientStatisticsByAmountSpent();
            bw2.append(nl + "Top Customers" + nl);
            for (int i = 0; i < clients.size(); i++) {
                bw2.append((i + 1) + ". " + clients.get(i).getName() + " - $" +
                        clients.get(i).getTotalAmountSpent());
                bw2.newLine();
            }
        }
    }
}

