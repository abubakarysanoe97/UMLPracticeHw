package umlpractice;

public class CheckCashingPlace {
    public static void main(String[] args) {

        HireDate hireDate = new HireDate("19","02","1995");
        HireDate hireDate1 = new HireDate("01","01","2023");

        Entrepreneur entrepreneur = new Entrepreneur("Maxine",50000.00,500.00);

        SalariedEmployee salariedEmployee = new SalariedEmployee("John",hireDate,45000.55);

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Doe",hireDate1,80000.00);

        HourlyEmployees hourlyEmployee = new HourlyEmployees("Mike",hireDate,21.20,58.00 );

        HourlyEmployees hourlyEmployee1 = new HourlyEmployees("Sam",hireDate1,16.50,24.0);

        Person[] people = {entrepreneur, hourlyEmployee, salariedEmployee1};
        Employee[] employees = {hourlyEmployee,hourlyEmployee1,salariedEmployee,salariedEmployee1};

        HumanResources.issueBadge(employees);

    }
}


