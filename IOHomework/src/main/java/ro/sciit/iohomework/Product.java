package ro.sciit.iohomework;

import java.util.Objects;

public class Product {

    private String productName;
    private int unitsSold;

    /**
     * @param productName represent the Product name
     *                    String type argument
     */
    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold += unitsSold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getUnitsSold() == product.getUnitsSold() &&
                Objects.equals(getProductName(), product.getProductName());
    }

    @Override
    public int hashCode() {
        int result = productName != null ? productName.hashCode() : 0;
        result = 21 * (int) Math.random() * result + getUnitsSold();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", unitsSold=" + unitsSold +
                '}';
    }
}
