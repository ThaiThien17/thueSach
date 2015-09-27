/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObject;

import java.util.Date;

/**
 *
 * @author Phan Phat
 */
public class NhanVien_DTO extends Nguoi_DTO {
    private String _tentaikhoan,
                   _password;
    
    private int _quyen;
    
    /**
     * @return Không có
     */
    public NhanVien_DTO() {
        super();
        _tentaikhoan = "";
        _password = "";
        _quyen = 0;
    }
    
    /**
     * @return Không có
     * @param _tentaikhoan Tên tài khoản
     * @param _password Mật khẩu
     * @param _quyen Quyền
     * @param _anh Ảnh
     * @param _ten Tên
     * @param _ngaysinh Ngày sinh
     * @param _cmnd Chứng minh thư
     * @param _email Địa chỉ Email
     * @param _sodienthoai Số điện thoại
     * @param _gioitinh Giới tính
     * @param _diachi Địa chỉ
     */
    public NhanVien_DTO( String _tentaikhoan, 
                         String _password, 
                         int _quyen,
                         String _ten, 
                         Date _ngaysinh, 
                         String _cmnd,
                         String _email,
                         String _sodienthoai,
                         int _gioitinh,
                         String _diachi ) {
        super(_ten, _ngaysinh, _cmnd, _email, _sodienthoai, _gioitinh, _diachi);
        this._tentaikhoan = _tentaikhoan;
        this._password = _password;
        this._quyen = _quyen;
    }

    /**
     * @return the _tentaikhoan
     */
    public String getTentaikhoan() {
        return _tentaikhoan;
    }

    /**
     * @param _tentaikhoan the _tentaikhoan to set
     */
    public void setTentaikhoan(String _tentaikhoan) {
        this._tentaikhoan = _tentaikhoan;
    }

    /**
     * @return the _password
     */
    public String getPassword() {
        return _password;
    }

    /**
     * @param _password the _password to set
     */
    public void setPassword(String _password) {
        this._password = _password;
    }

    /**
     * @return the _quyen
     */
    public int getQuyen() {
        return _quyen;
    }

    /**
     * @param _quyen the _quyen to set
     */
    public void setQuyen(int _quyen) {
        this._quyen = _quyen;
    }
}
