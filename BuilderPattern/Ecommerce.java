package BuilderPattern;

public class Ecommerce {
    protected static class EcomBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private String age;

        public EcomBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public EcomBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EcomBuilder email(String email) {
            this.email = email;
            return this;
        }

        public EcomBuilder address(String address) {
            this.address = address;
            return this;
        }

        public EcomBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public EcomBuilder age(String age) {
            this.age = age;
            return this;
        }

        public Ecommerce build() {
            if(lastName == null || firstName == null || email == null || address == null || phone == null) {
                System.err.println("Error. Please fill up all the required fields.");
                System.exit(0);
            }
            return new Ecommerce(this);
        }
    }

    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final String age;

    private Ecommerce(EcomBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

}
