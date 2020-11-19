package collections._3_lists;

import collections._2_defining_iterating.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Shipment implements Iterable<Product>{
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private static final int PRODUCT_NOT_EXIST = -1;
    private final List<Product> products = new ArrayList<>();
    private List<Product> HeavyVanProducts = new ArrayList<>();
    private List<Product> LightVanProducts = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct){
        final int index = products.indexOf(oldProduct);
        if (index != PRODUCT_NOT_EXIST){
            products.set(index, newProduct);
        }

    }

    public void prepare(){
        products.sort(Product.BY_WEIGHT);
        int splitIndex = findHeavyIndex(products);
        HeavyVanProducts = products.subList(0,splitIndex);
        LightVanProducts = products.subList(splitIndex ,products.size());
    }

    private int findHeavyIndex(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getWeight() > LIGHT_VAN_MAX_WEIGHT){
                return i;
            }
        }
        return 0;
    }

    public List<Product> getHeavyVanProducts() { return null; };
    public List<Product> getLightVanProducts() { return null; };

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
