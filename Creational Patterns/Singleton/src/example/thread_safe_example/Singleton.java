package example.thread_safe_example;

public class Singleton {
    private static volatile Singleton instance;

    public String value;
    public  int number;

    private Singleton(String value , int number) {
        this.value = value;
        this.number = number;
    }

    public static Singleton getInstance(String value,int number) {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value,number);
            }
            return instance;
        }
    }
}
