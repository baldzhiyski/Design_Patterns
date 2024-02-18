package second_example;

public class Main {
    public static void main(String[] args) {
        Address.Builder builder = Address.builder();

        builder.withFullNameAndEmail("Pesho","Petrov","petur123@abv.bg")
                .withName("George")
                .build();

    }
}
