/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceLayer.java;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Phát
 */
public class ThemSach_UIController implements Initializable {
    @FXML
    private Label lblTieuDe;
    @FXML
    private Button btnThem;
    @FXML
    private Button btnThoat;
    @FXML
    private TextField txfTen;
    @FXML
    private DatePicker dtpNgayXB;
    @FXML
    private TextField txfGiaBia;
    @FXML
    private ListView<?> litLoaiSach;
    @FXML
    private ComboBox<?> cbxLoaiSach;
    @FXML
    private ComboBox<?> cbxNXB;
    @FXML
    private ComboBox<?> cbxTacGia;
    @FXML
    private ComboBox<?> cbxNgonNgu;

    //KHAI BÁO THUỘC TÍNH ĐỂ ĐIỀU KHIỂN FORM
    //Controller Properties
    private boolean _cheDoSua;
    
    private String _idSach;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void cheDoSua(boolean _cheDoSua, String _idSach) {
        this._cheDoSua = _cheDoSua;
        this._idSach = _idSach;
        lblTieuDe.setText("SỬA THÔNG TIN HỌC SINH");
        btnThem.setText("Sửa");
    }
}
