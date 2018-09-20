
import org.junit.Test;
import ro.sciit.iohomework.Customer;
import ro.sciit.iohomework.Product;
import ro.sciit.iohomework.Sale;
import ro.sciit.iohomework.SalesStatistics;
import java.util.*;

import static org.junit.Assert.assertEquals;


public class StatisticsTest {

    @Test
    public void addSale() {
        // initialisation of sale
        Sale sale= new Sale(2,"AppleSmartphone",100,"John");
        //initialisation of product
        Product pr1= new Product("AppleSmartphone");
        pr1.setUnitsSold(2);
        //initialisation of client
        Customer client1=new Customer("John");
        client1.setTotalAmountSpent(sale.getOrderNr()*sale.getPrice());
        client1.setNumberOfOrders(client1.getNumberOfOrders());
        //initialisation of expected HashMaps
        HashMap<String,Product> productsListHashMap= new HashMap<>();
        HashMap<String,Customer> clientListHashMap= new HashMap<>();
        productsListHashMap.put(pr1.getProductName(),pr1);
        clientListHashMap.put(client1.getName(),client1);
        //sale initialisation
        SalesStatistics salesStatistic= new SalesStatistics();
        salesStatistic.addSale(sale);
        assertEquals(clientListHashMap,salesStatistic.getClientHashMap());
        assertEquals(productsListHashMap,salesStatistic.getProductsHashMap());
    }

    @Test
    public void getProductStatistics() {
        //generating unsorted Product collection
        HashMap<String,Product> productsListHashMap= new HashMap<>();
        List<Product> productsList= new ArrayList<>();
        Product pr1= new Product("AppleSmartphone");
        pr1.setUnitsSold(20);
        productsListHashMap.put(pr1.getProductName(),pr1);
        Product pr2= new Product("SamsungSmartphone");
        pr2.setUnitsSold(10);
        productsListHashMap.put(pr2.getProductName(),pr2);
        Product pr3= new Product("HuaweiSmartphone");
        pr3.setUnitsSold(30);
        productsListHashMap.put(pr3.getProductName(),pr3);
        // generating expected list
        List<Product> expectedProductsList= new ArrayList<>();
        Product exPr1=new Product ("HuaweiSmartphone");
        exPr1.setUnitsSold(30);
        expectedProductsList.add(exPr1);
        Product exPr2=new Product ("AppleSmartphone");
        exPr2.setUnitsSold(20);
        expectedProductsList.add(exPr2);
        Product exPr3=new Product ("SamsungSmartphone");
        exPr3.setUnitsSold(10);
        expectedProductsList.add(exPr3);
        SalesStatistics salesStatistic= new SalesStatistics();
        assertEquals(expectedProductsList, salesStatistic.getProductStatistics(productsListHashMap));
    }
    @Test
    public void getClientStatisticsByOrders() {
        //building expected client HashMap
        Customer customer1=new Customer("John");
        customer1.setNumberOfOrders(1);
        customer1.setTotalAmountSpent(100);
        Customer customer2=new Customer("John");
        customer2.setNumberOfOrders(customer1.getNumberOfOrders());
        customer2.setTotalAmountSpent(200);
        Customer customer3=new Customer("Jane");
        customer3.setTotalAmountSpent(100);
        customer3.setNumberOfOrders(1);
        HashMap<String,Customer> clientListHashMap= new HashMap<>();
        clientListHashMap.put(customer3.getName(),customer3);
        clientListHashMap.put(customer1.getName(),customer1);
        clientListHashMap.get(customer1.getName()).setTotalAmountSpent(200);
        clientListHashMap.get(customer1.getName()).setNumberOfOrders(1);
        //generating sales to be added to the statistics
        Sale sale= new Sale(1,"AppleSmartphone",100,"John");
        Sale sale2= new Sale(1,"AppleSmartphone",100,"Jane");
        Sale sale3= new Sale(1,"AppleSmartphone",200,"John");
        SalesStatistics salesStatistic= new SalesStatistics();
        salesStatistic.addSale(sale);
        salesStatistic.addSale(sale2);
        salesStatistic.addSale(sale3);
        //Hash Map to Collection  for comparison
        Collection<Customer> clientscollections = clientListHashMap.values();
        List<Customer> customersCollections1 =new ArrayList<>();
        int i=0;
        for(Map.Entry<String,Customer>entry :clientListHashMap.entrySet()){
            customersCollections1.add(i,(Customer) entry.getValue());
        }
        Collections.sort(customersCollections1, new Comparator<Customer>() {
            public int compare(Customer o1, Customer o2) {
                if (o2.getTotalAmountSpent() > o1.getTotalAmountSpent()) {
                    return 1;
                }
                if (o2.getTotalAmountSpent() < o1.getTotalAmountSpent()) {
                    return -1;
                }
                return 0;
            }
        });
        assertEquals(customersCollections1, salesStatistic.getClientStatisticsByAmountSpent());
    }

    @Test
    public void getClientStatisticsByAmountSpent() {
        //building expected client HashMap
        Customer client1=new Customer("John");
        client1.setNumberOfOrders(1);
        client1.setTotalAmountSpent(100);
        Customer client3=new Customer("Jane");
        client3.setTotalAmountSpent(200);
        client3.setNumberOfOrders(1);
        HashMap<String,Customer> clientListHashMap= new HashMap<>();
        clientListHashMap.put(client3.getName(),client3);
        clientListHashMap.put(client1.getName(),client1);
        //generating sales to be added to the statistics
        Sale sale= new Sale(1,"AppleSmartphone",100,"John");
        Sale sale2= new Sale(1,"AppleSmartphone",200,"Jane");
        SalesStatistics salesStatistic= new SalesStatistics();
        salesStatistic.addSale(sale);
        salesStatistic.addSale(sale2);
        //Hash Map to Collection  for comparison
        List<Customer> clientscollections =new ArrayList<>();
        int i=0;
        for(Map.Entry<String,Customer>entry :clientListHashMap.entrySet()){
            clientscollections.add(i,(Customer) entry.getValue());
        }
        //needs cast else test fails, with identical values
        assertEquals(clientscollections, salesStatistic.getClientStatisticsByAmountSpent());
    }
}
