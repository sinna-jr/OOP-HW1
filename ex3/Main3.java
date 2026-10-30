public class Main3 {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("123", "Toyota", 50);
        v1.displayDetails();
        System.out.println();

        System.out.println("Rental Cost: $" + v1.calculateRentalCost(3));

        v1.rentVehicle();
        System.out.println();

        v1.displayDetails();

        v1.returnVehicle();
        System.out.println();

        v1.displayDetails();

    }
}
