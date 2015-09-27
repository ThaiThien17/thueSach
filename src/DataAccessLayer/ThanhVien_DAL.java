/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import java.util.ArrayList;
import DataObject.ThanhVien_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Phan Phat
 */
public class ThanhVien_DAL implements ChucNang_DAL<ThanhVien_DTO>{
    /**
     * Câu truy vấn trả về mã thành viên tương ứng nếu lớn hơn 0 là mã đã bị trùng.
     */
    private final String SQL_KIEM_TRA_MA = "SELECT COUNT(*) AS 'SO_LUONG' FROM THANHVIEN WHERE MA_THANH_VIEN like ?";
    
    /**
     * Kiểm tra mã có bị trung hay không để đưa vào CSDL
     * @param doanma Đoạn mã được tạo ra từ tầng Business Layer đưa xuống
     * @return true: Đoạn mã vừa tạo bị trùng với mã trên CSDL.
     *         false: thì ngược lại.
     */
    public boolean biTrung(String doanMa) { 
        try {
            Connection conn = KetNoiDatabase.openConnection();
            
            PreparedStatement preSta = conn.prepareStatement(SQL_KIEM_TRA_MA);
            preSta.setString(1, doanMa);
            ResultSet result = preSta.executeQuery();
            while(result.next()) {
                if(result.getInt("SO_LUONG") != 0)                
                    return true;
            }
            
            conn.close();
        } catch (SQLException ex) {
            System.out.println("MaThanhVienDAL - kiemTraMa() - Lỗi");
        }
        return false;
    }

    @Override
    public ArrayList<ThanhVien_DTO> layDuLieu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void themDuLieu(ThanhVien_DTO object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void xoaDuLieu(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void suaDuLieu(ThanhVien_DTO object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
