
package teachers.salary.calculator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Section {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    public int getSectionId(String s){
        int id = 0;
        try{
            sql = "SELECT id from sections where sectionName = ?";
            con = DBConnection.connect();
            ps = con.prepareStatement(sql);
            ps.setString(1, s);
            rs = ps.executeQuery();
            while(rs.next()){
               id = rs.getInt("id");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try {
                rs.close();
                ps.close();
            } 
            catch (Exception e)
            {
               JOptionPane.showMessageDialog(null, e);  
            } 
        }
        return id;

    }
}
