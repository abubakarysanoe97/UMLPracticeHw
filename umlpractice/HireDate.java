package umlpractice;

public class HireDate {
    String day,month,year;

    public HireDate(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "HireDate" +
                "day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year;
    }
}
