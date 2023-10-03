package umlpractice;

public class SalariedEmployee extends Employee implements IPayable {
    private double salary;



    public SalariedEmployee(String name, HireDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, HireDate hireDate, double salary) {
        super(name,hireDate);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee" +
                "\nHireDate=" + getHireDate() +
                "\nName='" + getName();
    }
}


