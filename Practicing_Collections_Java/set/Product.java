package set;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>{
    private String name;
    private String code;
    private double price;
    private int quantity;

    public Product(String code, String name, double price, int quantity){
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(getCode(), product.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    @Override
    public String toString() {
        return "Product{Code: " + code + ", name: " + name + " ,quantity: " + quantity + " ,price: " + price + "}\n";
    }

    static class ComparatorByPrice implements Comparator<Product>{

        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());
        }
    }
}
