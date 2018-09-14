package teachers.salary.calculator;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

class DBConnection {
    Connection conn;
    public static Connection connect()
    {
        try{
           Class.forName("org.sqlite.JDBC");
//           C:\\Users\\Microsoft\\Documents\\NetBeansProjects\\Teachers Salary Calculator\\
           Connection conn = DriverManager.getConnection("jdbc:sqlite:TeachersSalaryCalculator.sqlite");
           return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , e);
            return null; 
        }
    }
}
    