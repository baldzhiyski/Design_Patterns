package third_example;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, Integer> memory;
    private static  Database instance;

    private Database(){
        try {
            Thread.sleep(10_000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        this.memory = new HashMap<>();
    }
    public void create(String key , int value){
        memory.put(key,value);
    }

    public int read(String key){
        return memory.get(key);
    }
    public void update(String key,int value){
        create(key,value);
    }
    public void remove(String key){
        memory.remove(key);
    }
    public static  Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
}
