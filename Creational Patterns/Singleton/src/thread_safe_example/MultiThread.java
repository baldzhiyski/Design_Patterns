package thread_safe_example;

public class MultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused " + "\n" +
                "If you see different values, then 2 singletons were created " + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO",21);
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR",22);
            System.out.println(singleton.value);
        }
    }
}
