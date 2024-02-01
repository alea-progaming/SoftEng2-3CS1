public class CarAssemble {
    public static void main(String[] args) {
        Car carAssemble = new Car.CarBuilder()
            .engineType("diesel")
            .transmission("automatic")
            .color("black")
            .passengerCap(4)
            .brand("Mazda")
            .build();
            

            System.out.println(carAssemble.brand);
            System.out.println(carAssemble.engineType);
            System.out.println(carAssemble.transmission);
            System.out.println(carAssemble.color);
            System.out.println(carAssemble.passengerCap);
    }
}