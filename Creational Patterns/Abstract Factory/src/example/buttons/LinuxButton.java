package example.buttons;

public class LinuxButton implements Button{
    @Override
    public void paint() {
        System.out.println("Successfully created "+ this.getClass().getSimpleName());
    }
}
