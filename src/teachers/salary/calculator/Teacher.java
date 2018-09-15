package teachers.salary.calculator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Teacher {
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
      
    int getTeacherId(String s){
        int id = -1;
        con = DBConnection.connect();
        try{
            String sql = "SELECT id from teachers where t_name = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1,s.toLowerCase());
            rs = ps.executeQuery();
            
            while(rs.next()){
                id = rs.getInt("id");
                break;
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
    
    String getTeacherName(int id){
        String name = "";
        con = DBConnection.connect();
        try{
            String sql = "SELECT t_name from teachers where id = ? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                name = rs.getString("t_name");
                break;
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
        return name;
    }
    
    String capitalizeTeacherName(String name){
        String capitalizedName = "";
        Scanner lineScan = new Scanner(name);
        while(lineScan.hasNext()) {
            String word = lineScan.next();
            capitalizedName += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
       }
        return capitalizedName.trim(); 
    }
}
