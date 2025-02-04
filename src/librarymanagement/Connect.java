/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author babus
 */
public class Connect {

    /**
     *
     * @return
     */
    public static Connection Connection(){
        Connection con=null;
        try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Yashu@2001");
        }catch(SQLException ex){
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE,null,ex);
        }
        return con;
    }
}
