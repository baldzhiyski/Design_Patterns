package non_thread_safe_example;

public class SingleThread {
    public static void main(String[] args) {
        System.out.println(Messages.OUTPUT_MULTI_THREAD);
        System.out.println(Messages.OUTPUT_SINGLE_THREAD);
        Singleton singleton = Singleton.getInstance("George");
        Singleton second = Singleton.getInstance("Pesho");

        System.out.printf(singleton.value + "->" + second.value);
    }
}
