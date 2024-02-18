package second_example;

public class Address {
    private String name;
    private String lastName;
    private String country;
    private String email;
    private  String street;

    private Address(){

    }
    public static Builder builder(){
        return new Builder();
    }

    protected static class Builder {
        private Address address;

        private Builder() {
            this.address = new Address();
        }

        public Builder withName(String name){
            this.address.name = name;
            return this;
        }
        public Builder withFullNameAndEmail(String name,String lastname , String email){
            this.address.name = name;
            this.address.lastName=lastname;
            this.address.email = email;
            return this;
        }
        public Builder withFullNameEmailAndStreet(String name,String lastname ,
                                               String email,String street){
            this.address.name = name;
            this.address.lastName=lastname;
            this.address.email = email;
            this.address.street = street;
            return  this;
        }
        public Address build(){
            return address;
        }

    }

}
