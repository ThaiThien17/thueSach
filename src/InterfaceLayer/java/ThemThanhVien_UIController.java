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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Phát
 */
public class ThemThanhVien_UIController implements Initializable {
    @FXML
    private Label lblTieuDe;
    @FXML
    private Button btnThem;
    @FXML
    private Button btnHuy;
    @FXML
    private TextField txfTen;
    @FXML
    private RadioButton radNam;
    @FXML
    private ToggleGroup gioitinh;
    @FXML
    private RadioButton radNu;
    @FXML
    private TextField txfCMND;
    @FXML
    private TextField txfHSSV;
    @FXML
    private TextField txfSDT;
    @FXML
    private TextField txfDiaChi;
    @FXML
    private TextField txfEmail;
    @FXML
    private ComboBox<?> cbxEmailDomain;
    @FXML
    private TextField txfNgaySinh;

    //KHAI BÁO THUỘC TÍNH ĐỂ ĐIỀU KHIỂN FORM
    //Controller Properties
    private boolean _cheDoSua;
    
    private String _idThanhVien;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    //Chế độ sửa
    public void cheDoSua(boolean _cheDoSua, String _idThanhVien) {
        this._cheDoSua = _cheDoSua;
        this._idThanhVien = _idThanhVien;
        lblTieuDe.setText("SỬA THÔNG TIN THÀNH VIÊN");
        btnThem.setText("Sửa");
    }
}
