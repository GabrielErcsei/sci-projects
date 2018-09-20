package ro.sciit.iohomework;

import java.util.*;

public class SalesStatistics {

    private HashMap<String, Customer> customers = new HashMap<>();
    private HashMap<String, Product> products = new HashMap<>();


    public HashMap<String, Product> getProductsHashMap() {
        return products;
    }

    public HashMap<String, Customer> getClientHashMap() {
        return customers;
    }

    /**
     * @param sale - Sale objects that is added to the statistics
     */
    public void addSale(Sale sale) {
        Customer customer = getClientFromMap(sale.getCustomerName());
        Product product = getProductFromMap(sale.getProduct());
        customer.setNumberOfOrders(customer.getNumberOfOrders());
        customer.setTotalAmountSpent(sale.getPrice() * sale.getOrderNr());
        product.setUnitsSold(sale.getOrderNr());
    }

    /**
     * @param customerName represents the name of the customer present in the read file
     * @return a Customer reference
     */
    private Customer getClientFromMap(String customerName) {
        Customer customer = null;
        if (!customers.containsKey(customerName)) {
            customer = new Customer(customerName);
            customers.put(customerName, customer);
        } else {
            customer = customers.get(customerName);
        }
        return customer;
    }

    /**
     * @param productName represents the product a specific customer has acquired
     * @return a Product reference
     */
    private Product getProductFromMap(String productName) {
        Product product = null;
        if (!products.containsKey(productName)) {
            product = new Product(productName);
            products.put(productName, product);
        } else {
            product = products.get(productName);
        }
        return product;
    }

    /**
     * Generates the sales statistics
     *
     * @return a sorted List<Product> by number of units sold
     */
    public List<Product> getProductStatistics(HashMap<String, Product> products) {
        Collection<Product> productsCollections = products.values();
        List<Product> productsList = new ArrayList<>(productsCollections);
        // I could have defined classes for Comparators but I never used the in-line declaration so I wanted to try it
        //Sorry if it is more difficult to read
        Collections.sort(productsList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getUnitsSold() - o1.getUnitsSold();
            }
        });
        return productsList;
    }

    /**
     * Generates the sales statistics
     *
     * @return a sorted List<Customer> by number of units in an order
     */
    public List<Customer> getClientStatisticsByOrderAmount() {
        Collection<Customer> customerscollections = customers.values();
        List<Customer> customerList = new ArrayList<>(customerscollections);
        Collections.sort(customerList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o2.getNumberOfOrders() - o1.getNumberOfOrders();
            }
        });
        return customerList;
    }



    /**
     * Generates the sales statistics
     *
     * @return a sorted List<Customer> by the amount of money spent
     */

    public List<Customer> getClientStatisticsByAmountSpent() {
        Collection<Customer> clientscollections = customers.values();
        List<Customer> clientsList = new ArrayList<>(clientscollections);
        Collections.sort(clientsList, new Comparator<Customer>() {
            @Override
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
        return clientsList;
    }
}
