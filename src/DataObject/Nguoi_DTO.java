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
public abstract class Nguoi_DTO {        
    private String _ten,
                   _cmnd,
                   _email,
                   _sodienthoai,
                   _diachi;
    
    private Date _ngaysinh;
    
    private int _gioitinh;
    
    /*
    * @return Không có
    */
    public Nguoi_DTO() {
        this._ten = "";
        this._ngaysinh = new Date();
        this._cmnd = "";
        this._email = "";
        this._sodienthoai = "";
        this._gioitinh = -1;
        this._diachi = "";
    }
    
    /**
     * @return Không có
     * @param _anh Ảnh
     * @param _ten Tên
     * @param _ngaysinh Ngày sinh
     * @param _cmnd Số chứng minh thư
     * @param _email Địa chỉ Email
     * @param _sodienthoai Số điện thoại
     * @param _gioitinh Giới tính
     * @param _diachi Địa chỉ
     */
    public Nguoi_DTO(String _ten, Date _ngaysinh, String _cmnd, String _email, String _sodienthoai,int _gioitinh, String _diachi) {
        this._ten = _ten;
        this._ngaysinh = _ngaysinh;
        this._cmnd = _cmnd;
        this._email = _email;
        this._sodienthoai = _sodienthoai;
        this._gioitinh = _gioitinh;
        this._diachi = _diachi;
    }

    /**
     * @return the _ten
     */
    public String getTen() {
        return _ten;
    }

    /**
     * @param _ten the _ten to set
     */
    public void setTen(String _ten) {
        this._ten = _ten;
    }

    /**
     * @return the _ngaysinh
     */
    public Date getNgaysinh() {
        return _ngaysinh;
    }

    /**
     * @param _ngaysinh the _ngaysinh to set
     */
    public void setNgaysinh(Date _ngaysinh) {
        this._ngaysinh = _ngaysinh;
    }

    /**
     * @return the _cmnd
     */
    public String getCmnd() {
        return _cmnd;
    }

    /**
     * @param _cmnd the _cmnd to set
     */
    public void setCmnd(String _cmnd) {
        this._cmnd = _cmnd;
    }

    /**
     * @return the _email
     */
    public String getEmail() {
        return _email;
    }

    /**
     * @param _email the _email to set
     */
    public void setEmail(String _email) {
        this._email = _email;
    }
    
    /**
     * @return the _gioitinh
     */
    public int getGioitinh() {
        return _gioitinh;
    }

    /**
     * @param _gioitinh the _gioitinh to set
     */
    public void setGioitinh(int _gioitinh) {
        this._gioitinh = _gioitinh;
    }
}
