package umlpractice;

public class Entrepreneur extends Person implements IPayable{
    private double revenue;
    private double expenses;

    public Entrepreneur(String name) {
        super(name);

    }
    @Override
    public double calculatePay() {
      return revenue - expenses;
    }

   public Entrepreneur(String name, double salary, double expenses) {
        super(name);
        this.revenue = salary;
        this.expenses = expenses;
    }

    public double getSalary() {
        return revenue;
    }

    public void setSalary(double salary) {
        this.revenue = salary;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }


}
