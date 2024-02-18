package first_example;

import first_example.products.Copyable;
import first_example.products.Product;
import first_example.products.Record;
import first_example.products.Registry;

public class Main {
    public static void main(String[] args) {
        // Creating PrototypeRegistry and registering prototypes
        Registry registry = new Registry();
        registry.registerPrototype("Product", new Product("Default Product", 0.0, "Default Description"));
        registry.registerPrototype("Record", new Record(0,"Default Data"));

        // Getting and cloning prototypes
        Copyable productPrototype = registry.getPrototype("Product");
        Copyable recordPrototype = registry.getPrototype("Record");

    }
}