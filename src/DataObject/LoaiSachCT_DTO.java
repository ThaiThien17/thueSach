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
public class LoaiSachCT_DTO {
    private String _masach,
                   _maloai;
    
    /**
     * @return Không có
     */
    public LoaiSachCT_DTO() {
        this._masach = "";
        this._maloai = "";
    }
    
    /**
     * @return Không có
     * @param _masach Mã sách
     * @param _maloai Mã Loại
     */
    public LoaiSachCT_DTO(String _masach, String _maloai) {
        this._masach = _masach;
        this._maloai = _maloai;
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
     * @return the _maloai
     */
    public String getMaloai() {
        return _maloai;
    }

    /**
     * @param _maloai the _maloai to set
     */
    public void setMaloai(String _maloai) {
        this._maloai = _maloai;
    }
}
