
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
                con.close();
            } 
            catch (Exception e)
            {
               JOptionPane.showMessageDialog(null, e);  
            } 
        }
        return id;
    }
        public String getSectionName(int id){
        String secName = "Not Found";
        try{
            sql = "SELECT sectionName from sections where id = ?";
            con = DBConnection.connect();
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(id));
            rs = ps.executeQuery();
            while(rs.next()){
               secName = rs.getString("sectionName");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try {
                rs.close();
                ps.close();
                con.close();
            } 
            catch (Exception e)
            {
               JOptionPane.showMessageDialog(null, e);  
            } 
        }
        return secName;

    }
}
