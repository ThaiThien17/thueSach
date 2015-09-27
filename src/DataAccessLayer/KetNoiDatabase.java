/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import java.sql.*;

/**
 *
 * @author Phan Phat
 */
class KetNoiDatabase {
    private final static String DRIVER_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final static String DB_LINK = "jdbc:sqlserver://PHAT-FB309B7108\\SQLEXPRESS:1433;integratedSecurity=true;databaseName=THUE_SACH";    
    private static Connection _sqlConnect;
    
    /*
    * @return Không có
    */
    public KetNoiDatabase () {
        //empty
    }   
    
    /*
    * Phương thức kết nối CSDL
    * @return Không có    
    */    
    public static Connection openConnection () {
        try {
            Class.forName(DRIVER_NAME);
            _sqlConnect = DriverManager.getConnection(DB_LINK);
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found!");
        } catch (SQLException ex) {
            System.out.println("Cannot connect!");
        }        
        return _sqlConnect;
    }   
}
