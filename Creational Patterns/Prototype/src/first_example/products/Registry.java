package first_example.products;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Copyable> prototypes;

    public Registry(){
        prototypes = new HashMap<>();
    }
    public void registerPrototype(String type, Copyable prototype) {
        prototypes.put(type, prototype);
    }

    public Copyable getPrototype(String type) {
        Copyable prototype = prototypes.get(type);
        if (prototype != null) {
            return prototype.clone();
        } else {
            System.out.println("Prototype with type " + type + " doesn't exist.");
            return null;
        }
    }
}
