/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObject;

/**
 *
 * @author USER
 */
public class LoaiSach_DTO {
    private String _maloai,
                   _loaisach;

    /**
     * @return Không có
     */
    public LoaiSach_DTO()
    {
        this._maloai = "";
        this._loaisach = "";
    }
    
    /**
     * @return Không có
     * @param _maloai Mã loại sách
     * @param _loaisach Loại sách
     */   
    public LoaiSach_DTO(String _maloai, String _loaisach) {
        this._maloai = _maloai;
        this._loaisach = _loaisach;
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

    /**
     * @return the _loaisach
     */
    public String getLoaisach() {
        return _loaisach;
    }

    /**
     * @param _loaisach the _loaisach to set
     */
    public void setLoaisach(String _loaisach) {
        this._loaisach = _loaisach;
    }
}
