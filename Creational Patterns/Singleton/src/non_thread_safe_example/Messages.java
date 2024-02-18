package non_thread_safe_example;

public enum Messages {
    ;
    public static final String OUTPUT_MULTI_THREAD = "If you see the same value, then singleton was reused ";
    public static final String OUTPUT_SINGLE_THREAD = "If you see different values, then 2 singletons were created";

}
