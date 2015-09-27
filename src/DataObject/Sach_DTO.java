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
public class Sach_DTO {
    private String _masach,
                   _maloaisach,
                   _tensach,
                   _nhaxuatban;
    
    private Date _ngayphathanh;
    
    private int _soluong,
                _giasach;
    
    /**
    * @return Không có
    */
    public Sach_DTO()
    {
        this._masach = "";
        this._maloaisach = "";
        this._tensach = "";
        this._nhaxuatban = "";
        this._ngayphathanh = new Date();
        this._soluong = 0;
        this._giasach = 0;
    }
    
    /**
     * @return Không có
     * @param _masach Mã sách
     * @param _maloaisach Mã loại sách
     * @param _tensach Tên sách
     * @param _nhaxuatban Nhà xuất bản
     * @param _ngayphathanh Ngày phát hành
     * @param _soluong Số lượng 
     * @param _giasach Giá sách
     */
    public Sach_DTO(String _masach, String _maloaisach, String _tensach, String _nhaxuatban, Date _ngayphathanh, int _soluong, int _giasach) {
        this._masach = _masach;
        this._maloaisach = _maloaisach;
        this._tensach = _tensach;
        this._nhaxuatban = _nhaxuatban;
        this._ngayphathanh = _ngayphathanh;
        this._soluong = _soluong;
        this._giasach = _giasach;
    }

    /**
     * @return the _masach
     */
    public String getMasach() {
        return _masach;
    }

    /**
     * @param _masach the _masach to set
     */
    public void setMasach(String _masach) {
        this._masach = _masach;
    }

    /**
     * @return the _maloaisach
     */
    public String getMaloaisach() {
        return _maloaisach;
    }

    /**
     * @param _maloaisach the _maloaisach to set
     */
    public void setMaloaisach(String _maloaisach) {
        this._maloaisach = _maloaisach;
    }

    /**
     * @return the _tensach
     */
    public String getTensach() {
        return _tensach;
    }

    /**
     * @param _tensach the _tensach to set
     */
    public void setTensach(String _tensach) {
        this._tensach = _tensach;
    }

    /**
     * @return the _nhaxuatban
     */
    public String getNhaxuatban() {
        return _nhaxuatban;
    }

    /**
     * @param _nhaxuatban the _nhaxuatban to set
     */
    public void setNhaxuatban(String _nhaxuatban) {
        this._nhaxuatban = _nhaxuatban;
    }

    /**
     * @return the _ngayphathanh
     */
    public Date getNgayphathanh() {
        return _ngayphathanh;
    }

    /**
     * @param _ngayphathanh the _ngayphathanh to set
     */
    public void setNgayphathanh(Date _ngayphathanh) {
        this._ngayphathanh = _ngayphathanh;
    }

    /**
     * @return the _soluong
     */
    public int getSoluong() {
        return _soluong;
    }

    /**
     * @param _soluong the _soluong to set
     */
    public void setSoluong(int _soluong) {
        this._soluong = _soluong;
    }

    /**
     * @return the _giasach
     */
    public int getGiasach() {
        return _giasach;
    }

    /**
     * @param _giasach the _giasach to set
     */
    public void setGiasach(int _giasach) {
        this._giasach = _giasach;
    }
}
