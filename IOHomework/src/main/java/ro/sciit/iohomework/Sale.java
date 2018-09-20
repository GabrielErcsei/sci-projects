package ro.sciit.iohomework;

public class Sale {

    private int orderNr;
    private String productName;
    private int price;
    private String customerName;

    public Sale(int orderNr, String product, int price, String customerName) {
        this.orderNr = orderNr;
        this.productName = product;
        this.price = price;
        this.customerName = customerName;
    }

    public int getOrderNr() {
        return orderNr;
    }

    public String getProduct() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public String getCustomerName() {
        return customerName;
    }

}
