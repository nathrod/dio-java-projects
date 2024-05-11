package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
    private Set<Product> productSet;

    public ProductRegistration(){
        productSet = new HashSet<>();
    }

    public void addProduct(String code, String name, double price, int quantity){
        productSet.add(new Product(code, name, price, quantity));
    }

    public Set<Product> displayProductsByName(){
        Set<Product> productsByName = new TreeSet<>(productSet);
        return productsByName;
    }

    public Set<Product> displayProductsByPrice(){
        Set<Product> productsByPrice = new TreeSet<>(new Product.ComparatorByPrice());
        productsByPrice.addAll(productSet);
        return productsByPrice;
    }
}
