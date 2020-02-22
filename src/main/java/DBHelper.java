//hepsini getir
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mert
 */
public class DBHelper {
    
    private String username= "root";
    private String password = "pme123";
    private String dbURL = "jdbc:mysql://localhost:3306/world?useSLL=false&serverTimezone=UTC";
      
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbURL,username,password);
    }
    
    public void showErrorMesseage(SQLException exception){
        System.out.println("hata "+exception.getMessage());
        System.out.println("hata kodu "+exception.getErrorCode());

    }
    
}
