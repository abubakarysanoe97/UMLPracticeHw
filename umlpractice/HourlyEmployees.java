package umlpractice;

public class HourlyEmployees extends Employee{
    private double hourlyRate;
    public double HoursWorked;

    public HourlyEmployees(String name, HireDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployees(String name, HireDate hireDate, double hourlyRate, double hoursWorked ) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        HoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate*HoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyEmployee" +
                "\nIncome: $" + calculatePay() +
                "\nHireDate:" + getHireDate() +
                "\nName='" + getName();
    }
}
