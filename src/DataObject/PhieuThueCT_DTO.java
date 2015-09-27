/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObject;

/**
 *
 * @author Phan Phat
 */
public class PhieuThueCT_DTO {
    private String _maphieuthue,
                   _masach;
    
    /**
     * @return Không có
     */
    public PhieuThueCT_DTO() {
        this._maphieuthue = "";
        this._masach = "";
    }
    
    /**
     * @return Không có
     * @param _maphieuthue Mã phiếu thuê
     * @param _masach Mã sách
     */
    public PhieuThueCT_DTO(String _maphieuthue, String _masach) {
        this._maphieuthue = _maphieuthue;
        this._masach = _masach;
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
}
