package teachers.salary.calculator;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

class DBConnection {

    Connection conn;

    public static Connection connect() {
        //  'TeachersSalaryCalculator.sqlite' Name of DB file, must be at the root level of the project
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:TeachersSalaryCalculator.sqlite");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
