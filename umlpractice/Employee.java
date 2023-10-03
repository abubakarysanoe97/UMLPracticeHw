package umlpractice;

public abstract class Employee extends Person implements IPayable  {
    private HireDate hireDate;

    public HireDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }

    public Employee(String name, HireDate hiredate) {

        super(name);
        this.hireDate =hiredate;
    }


    @Override
    public String toString() {
        return "Employee" +
                "\nhireDate: " + hireDate +
                "\nname: " + getName() + '\'' +
                '}';

    }
}
