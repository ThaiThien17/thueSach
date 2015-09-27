/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phan Phat
 */
public class TaoMa_DAL {
    private int _soluong;
    
    //Constructor
    public TaoMa_DAL(String tenBang) {
        taoBang(tenBang);
        laySoLuong();
    }
    
    /**
     * Lấy số lượng dòng trên bảng.
     */
    private String SQL_DEM_SO_LUONG = "SELECT COUNT(*) AS 'SO_LUONG' FROM ";
    
    /**
     * Tạo câu truy vấn trên bảng.
     * @param tenBang Tên bảng trong CSDL
     * @return Trả về chuỗi câu truy vấn trên bảng.
     */
    private String taoBang(String tenBang) {
        return SQL_DEM_SO_LUONG + tenBang;
    }
    
    /**
     * Lấy số lượng để tạo mã cho đối tượng
     */
    private void laySoLuong() {
        try {
            Connection conn = KetNoiDatabase.openConnection();
            
            Statement truyVan = conn.createStatement();
            ResultSet ketQua = truyVan.executeQuery(SQL_DEM_SO_LUONG);
            while(ketQua.next()) {
                _soluong = ketQua.getInt("SO_LUONG");
                break;
            }            
            
            conn.close();
        } catch (SQLException ex) {
            System.out.println("TaoMa_DAL - laySoLuong - Lỗi");
        }
    }

    /**
     * @return the _soluong
     */
    public int getSoluong() {
        return _soluong;
    }
}
