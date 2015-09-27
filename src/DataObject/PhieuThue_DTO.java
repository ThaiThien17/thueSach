/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObject;

import java.util.Date;

/**
 *
 * @author USER
 */
public class PhieuThue_DTO {
    private String _maphieuthue,
                    _mathanhvien,
                    _tentaikhoan;
    
    private Date _ngaythue,
                _ngaytra;

    /**
     * @return Không có
     */
    public PhieuThue_DTO ()
    {
        this._maphieuthue = "";
        this._mathanhvien = "";
        this._tentaikhoan = "";
        this._ngaythue = new Date();
        this._ngaytra = new Date();
    }
    
    /**
     * @return Không có
     * @param _maphieuthue Mã phiếu thuê
     * @param _mathanhvien Mã thành viên
     * @param _tentaikhoan Tên tài khoản
     * @param _ngaythue Ngày thuê
     * @param _ngaytra Ngày trả
     */
    public PhieuThue_DTO( String _maphieuthue, 
                          String _mathanhvien, 
                          String _tentaikhoan, 
                          Date _ngaythue, 
                          Date _ngaytra, 
                          int _tiencoc, 
                          int _loinhuan) {
        this._maphieuthue = _maphieuthue;
        this._mathanhvien = _mathanhvien;
        this._tentaikhoan = _tentaikhoan;
        this._ngaythue = _ngaythue;
        this._ngaytra = _ngaytra;
    }

    /**
     * @return the _maphieuthue
     */
    public String getMaphieuthue() {
        return _maphieuthue;
    }

    /**
     * @param _maphieuthue the _maphieuthue to set
     */
    public void setMaphieuthue(String _maphieuthue) {
        this._maphieuthue = _maphieuthue;
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
     * @return the _ngaythue
     */
    public Date getNgaythue() {
        return _ngaythue;
    }

    /**
     * @param _ngaythue the _ngaythue to set
     */
    public void setNgaythue(Date _ngaythue) {
        this._ngaythue = _ngaythue;
    }

    /**
     * @return the _ngaytra
     */
    public Date getNgaytra() {
        return _ngaytra;
    }

    /**
     * @param _ngaytra the _ngaytra to set
     */
    public void setNgaytra(Date _ngaytra) {
        this._ngaytra = _ngaytra;
    }
}
