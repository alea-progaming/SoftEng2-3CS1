package BuilderPattern;

import java.util.List;

public class ECommerceApp {
    public static void main(String[] args) {
        Ecommerce myAccount = new Ecommerce.EcomBuilder()
                .lastName("Purugganan")
                .firstName("Mikaela")
                .email("mikaela.purugganan@neu.edu.ph")
                .address("Novaliches, QC")
                .phone("0999-999-9999")
                .age("21")
                .build();

        System.out.println(myAccount.firstName);
        System.out.println(myAccount.lastName);
        System.out.println(myAccount.email);
        System.out.println(myAccount.address);
        System.out.println(myAccount.phone);
        System.out.println(myAccount.age);
    }
}
