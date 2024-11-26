package conn;

import java.util.ArrayList;
import java.util.Collection;

public class FloatCollectionExample {
    public static void main(String[] args) {
        // Create a Collection to hold Float elements
        Collection<Float> floatCollection = new ArrayList<>();

        // Adding elements to the Collection
        floatCollection.add(10.5f);
        floatCollection.add(20.3f);
        floatCollection.add(30.8f);
        floatCollection.add(40.2f);
        floatCollection.add(50.1f);
        System.out.println(floatCollection);
    }
}
