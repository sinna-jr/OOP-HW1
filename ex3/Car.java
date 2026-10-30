public class Car extends Vehicle {

    private int numberOfSeats;

    public Car(String licensePlate, String model, double dailyRate, int numberOfSeats){
        super(licensePlate, model, dailyRate);
        this.numberOfSeats = Math.max(numberOfSeats, 0);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats >= 0) {
            this.numberOfSeats = numberOfSeats;
        }
    }

    @Override
    public double calculateRentalCost(int days) {
        double serviceFee = 20;
        return super.calculateRentalCost(days) + serviceFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
    }

}
