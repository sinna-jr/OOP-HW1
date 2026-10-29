public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = Math.max(hoursWorked, 0);
        this.hourlyRate = Math.max(hourlyRate, 0);

    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        }
    }
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        }
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

}
