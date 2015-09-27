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
public class ThanhVien_DTO extends Nguoi_DTO {
    private String _mathanhvien, // Mã này gồm 9 số tạo ngẫu nhiên
                   _masosvhs;
    
    private int _tinhtrang;
    
    private long _tien;
    
    /**
     * @return 
     */
    public ThanhVien_DTO() {
        super();
        _mathanhvien = "";
        _masosvhs = "";
        _tinhtrang = 0;
        _tien = 0;
    }
    
    /**
     * @return Không có
     * @param _mathanhvien Mã thành viên
     * @param _masosvhs Mã số học sinh, sinh viên
     * @param _tinhtrang Tình trạng thành viên
     * @param _anh Ảnh
     * @param _ten Tên thành viên
     * @param _ngaysinh Ngày sinh
     * @param _cmnd Số chứng minh nhân dân
     * @param _email Địa chỉ Email
     * @param _sodienthoai  Số điện thoại
     * @param _tien Số tiền trong thẻ thành viên
     * @param _gioitinh Giới tính
     * @param _diachi Địa chỉ
     */
    public ThanhVien_DTO( String _mathanhvien, 
                          String _masosvhs, 
                          int _tinhtrang, 
                          String _ten, 
                          Date _ngaysinh, 
                          String _cmnd,
                          String _email, 
                          String _sodienthoai, 
                          long _tien,
                          int _gioitinh,
                          String _diachi ) {
        super(_ten, _ngaysinh, _cmnd, _email, _sodienthoai, _gioitinh, _diachi);
        this._mathanhvien = _mathanhvien;
        this._masosvhs = _masosvhs;
        this._tinhtrang = _tinhtrang;
        this._tien = _tien;
    }

    /**
     * @return the _mathanhvien
     */
    public String getMathanhvien() {
        return _mathanhvien;
    }

    /**
     * @param _mathanhvien the _mathanhvien to set
     */
    public void setMathanhvien(String _mathanhvien) {
        this._mathanhvien = _mathanhvien;
    }

    /**
     * @return the _masosvhs
     */
    public String getMasosvhs() {
        return _masosvhs;
    }

    /**
     * @param _masosvhs the _masosvhs to set
     */
    public void setMasosvhs(String _masosvhs) {
        this._masosvhs = _masosvhs;
    }

    /**
     * @return the _tinhtrang
     */
    public int getTinhtrang() {
        return _tinhtrang;
    }

    /**
     * @param _tinhtrang the _tinhtrang to set
     */
    public void setTinhtrang(int _tinhtrang) {
        this._tinhtrang = _tinhtrang;
    }
    
    /**
     * @return the _tien
     */
    public long getTien() {
        return _tien;
    }

    /**
     * @param _tinhtrang the _tien to set
     */
    public void setTien(long _tien) {
        this._tien = _tien;
    }
}
