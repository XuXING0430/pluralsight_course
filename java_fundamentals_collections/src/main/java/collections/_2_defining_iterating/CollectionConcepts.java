package collections._2_defining_iterating;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * This practice the simple method about Collection
 */
public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Flooer Panel", 25);
        Product window = new Product("Glass Window" , 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        final Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()){
            Product product =  productIterator.next();
            if(product.getWeight() > 20){
                System.out.println(product);
            }else {
                productIterator.remove();
            }

        }
        //System.out.println(products);
        //for (Product product : products) {
        //    System.out.println(product);
        //}

        System.out.println(products);
        System.out.println(products.size());
        System.out.println(products.contains(door));

        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(window);
        otherProducts.add(door);
        otherProducts.add(floorPanel);

        otherProducts.removeAll(products);
        System.out.println(otherProducts);
    }
}
