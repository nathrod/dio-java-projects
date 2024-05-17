package map;

import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    private Map<Long, Product> productMap;

    public ProductInventory(){
        this.productMap = new HashMap<>();
    }

    public void addProduct(long code, String name, int quantity, double price){
        productMap.put(code, new Product(name, quantity, price));
    }

    public void displayProducts(){
        System.out.println(productMap);
    }

    public double calculateTotalInventoryValue(){
        double totalValue = 0;
        if(!productMap.isEmpty()){
            for(Product p : productMap.values()){
                totalValue += p.getQuantity()*p.getPrice();
            }
        }
        return totalValue;
    }

    public Map<Long, Product> getMostExpensiveProduct(){
        Map<Long, Product> mostExpensiveProducts = new HashMap<>();
        double maxValue = Double.MIN_VALUE;


        for (Map.Entry<Long, Product> entry : productMap.entrySet()) {
            Product product = entry.getValue();
            double value = product.getPrice() * product.getQuantity();
            if (value > maxValue) {
                mostExpensiveProducts.clear(); // Limpar os produtos anteriores com valor máximo
                mostExpensiveProducts.put(entry.getKey(), product);
                maxValue = value;
            } else if (value == maxValue) {
                mostExpensiveProducts.put(entry.getKey(), product);
            }
        }

        return mostExpensiveProducts;
    }

    public Map<Long, Product> getCheapestProduct(){
        Map<Long, Product> cheapestProduct = new HashMap<>();
        double minValue = Double.MAX_VALUE;

        for (Map.Entry<Long, Product> entry : productMap.entrySet()) {
            Product product = entry.getValue();
            double value =  product.getPrice()*product.getQuantity();
            if(value < minValue){
                cheapestProduct.clear();
                cheapestProduct.put(entry.getKey(), product);
                minValue = value;
            } else if (value == minValue) {
                cheapestProduct.put(entry.getKey(), product);
            }
        }
        return cheapestProduct;
    }

    public Map<Long, Product> getProductWithHighestQuantityTotalValueInInventory(){
        Map<Long, Product> highestQuantityProduct = new HashMap<>();
        double maxQuantityValue = Double.MIN_VALUE;

        for (Map.Entry<Long, Product> entry : productMap.entrySet()) {
            Product product = entry.getValue();
            double quantityValue = product.getQuantity() * product.getPrice();
            if (quantityValue > maxQuantityValue) {
                highestQuantityProduct.clear();
                highestQuantityProduct.put(entry.getKey(), product);
                maxQuantityValue = quantityValue;
            } else if (quantityValue == maxQuantityValue) {
                highestQuantityProduct.put(entry.getKey(), product);
            }
        }

        return highestQuantityProduct;
    }
}

















