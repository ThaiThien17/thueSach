/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer.Others;

import DataAccessLayer.TaoMa_DAL;

/**
 *
 * @author Phan Phat
 */
public class TaoMa_BSL {
    private final int DO_DAI = 9;
    
    private String _ma;
    
    //Constructor
    public TaoMa_BSL(String kiTuDau, String tenBang) {        
        TaoMa_DAL taomaDAL = new TaoMa_DAL(tenBang);
        _ma = String.valueOf(taomaDAL.getSoluong());
        for(int i = 0; i < DO_DAI - _ma.length(); i++)
            _ma = "0" + _ma;       
    }

    /**
     * @return the _ma
     */
    public String getMa() {
        return _ma;
    }
}
