
public class Main3 {

    public static void main(String[] args) {

        RentalAgency agency = new RentalAgency("City Wheels");

        Car car = new Car("ABC-123", "Toyota Camry", 50, 5);

        Motorcycle motorcycle = new Motorcycle(
                "XYZ-456", "Yamaha MT-07", 30, true
        );

        agency.addVehicle(car);
        agency.addVehicle(motorcycle);

        agency.displayAvailableVehicles();

        System.out.println("----------------------");

        agency.rentVehicle("ABC-123", 3);

        System.out.println("----------------------");

        agency.rentVehicle("ABC-123", 3);

        System.out.println("----------------------");

        agency.returnVehicle("ABC-123");

        System.out.println("----------------------");

        agency.displayAvailableVehicles();

    }
}
