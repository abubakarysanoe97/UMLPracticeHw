package umlpractice;

public class HumanResources {
    public static void printBadge(Employee employee) {
        String employeeName = employee.getName();
        System.out.println(employeeName);
    }

    public static void issueBadge(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee + " ");
            System.out.println("========");
        }

    }
}

