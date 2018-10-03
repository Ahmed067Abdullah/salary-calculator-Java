package teachers.salary.calculator;

public class Month {

    public String getMonthName(int m) {
        String month = "Error";
        if (m == 0) {
            month = "January";
        } else if (m == 1) {
            month = "February";
        } else if (m == 2) {
            month = "March";
        } else if (m == 3) {
            month = "April";
        } else if (m == 4) {
            month = "May";
        } else if (m == 5) {
            month = "June";
        } else if (m == 6) {
            month = "July";
        } else if (m == 7) {
            month = "August";
        } else if (m == 8) {
            month = "September";
        } else if (m == 9) {
            month = "October";
        } else if (m == 10) {
            month = "November";
        } else if (m == 11) {
            month = "December";
        }

        return month;
    }
}
