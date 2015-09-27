/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer.Others;

import DataAccessLayer.ThanhVien_DAL;
import java.util.Random;

/**
 *
 * @author Phan Phat
 * +    Class này dùng để tạo mã ngẫu nhiên cho thành viên, mã này là độc lập và duy 
 *      nhất không trùng với mã của bất cứ thành viên nào.
 * 
 * +    Quy tắc hoạt động
 * B1   Class MaThanhVien_BSL tạo mã có độ dài N
 *                         |
 *                         |
 *                         | Đoạn mã N kí tự MaThanhVien_DAO
 *                         |
 *                         V
 * B2   Class MaThanhVien_DAL kiểm tra trong CSDL có tồn tại mã đó hay không. Nếu có
 *      phương thức trả về true không thì trả về false.
 *      +   Nếu true kết thúc quá trình tạo mã, cho phép đoạn mã được gán vào đối tượng.
 *      +   Nếu false tiến hành lại B1.
 * 
 * +    Hàm Random phải setSeed() vì trên thực tế hàm Random tạo số ngẫu nhiên dựa trên 
 *      công thức có sẵn.
 */
public class TaoMaThanhVien_BSL {
    private final int DO_DAI_MAX = 9;
    private Random _taoma;
    private String _doanma;
    
    //Constructor
    public TaoMaThanhVien_BSL() {
        _taoma = new Random();
        _taoma.setSeed(System.currentTimeMillis());
        _doanma = "";
        while(true) {
            taoMa();
            if(biTrung())
                _doanma = "";
            else 
                break;
        }
    }
    
    /**
     * Tạo mã ngẫu nhiên
     * @return Trả về đoạn mã với các kí tự ngẫu nhiên có độ dài nhỏ hơn DO_DAI_MAX.
     */
    private String taoMa() {
        int i = 0;
        while(i++ < DO_DAI_MAX)
            _doanma += String.valueOf(_taoma.nextInt(10));
        return _doanma;
    }
    
    /**
     * Kiểm tra đoạn mã vừa tạo đã tồn tại trên CSDL hay chưa.
     * @return true: Là mã đã bị trùng trên CSDL.
     *         false: Ngược lại.
     */
    private boolean biTrung() {
        ThanhVien_DAL tvDAL = new ThanhVien_DAL();
        return tvDAL.biTrung(_doanma);
    }

    /**
     * @return the _doanma
     */
    public String getDoanma() {        
        return _doanma;
    }
}
