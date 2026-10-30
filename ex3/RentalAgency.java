import java.util.*;

public class RentalAgency {

    private String agencyName;
    private ArrayList<Vehicle> fleet;

    public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        this.fleet = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void displayAvailableVehicles() {
        System.out.println("Available Vehicles in " + agencyName + ":");

        for (int i = 0; i < fleet.size(); i++) {
            if (!fleet.get(i).isRented()) {
                fleet.get(i).displayDetails();
                System.out.println();
            }
        }
    }

    public void rentVehicle(String licensePlate, int days) {
        for (int i = 0; i < fleet.size(); i++) {

            Vehicle vehicle = fleet.get(i);

            if (vehicle.getLicensePlate().equals(licensePlate)) {
                if (vehicle.isRented()) {

                    System.out.println("Vehicle is already rented!");
                    return;
                }
                if (days <= 0) {
                    System.out.println("Invalid rental days!");
                    return;
                }
                double cost = vehicle.calculateRentalCost(days);
                vehicle.rentVehicle();
                System.out.println("Rental successful!");
                System.out.println("Vehicle:" + vehicle.getModel());
                System.out.println("Rental Days:" + days);
                System.out.println("Total Cost:" + cost);
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }


    public void returnVehicle(String licensePlate) {

        for (int i = 0; i < fleet.size(); i++) {

            Vehicle vehicle = fleet.get(i);

            if (vehicle.getLicensePlate().equals(licensePlate)) {

                if (!vehicle.isRented()) {

                    System.out.println("Vehicle is not currently rented!");
                    return;
                }
                vehicle.returnVehicle();
                System.out.println("Vehicle returned successfully!");
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }



}
