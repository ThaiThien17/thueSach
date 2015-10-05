/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceLayer.java;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Phát
 */
public class DieuKhien_UIController implements Initializable {
    @FXML
    private Button btnThem;
    @FXML
    private Button btnXoa;
    @FXML
    private Button btnSua;
    @FXML
    private TextField txfTimKiem;
    @FXML
    private Button btnTimKiem;
    @FXML
    private Button btnCaiDatTimKiem;
    @FXML
    private TabPane tabTabPane;
    @FXML
    private Tab tabSach;
    @FXML
    private TableView<?> tableSach;
    @FXML
    private TableColumn<?, ?> colSach_MaSach;
    @FXML
    private TableColumn<?, ?> colSach_Ten;
    @FXML
    private TableColumn<?, ?> colSach_NXB;
    @FXML
    private TableColumn<?, ?> colSach_TacGia;
    @FXML
    private TableColumn<?, ?> colSach_NgonNgu;
    @FXML
    private TableColumn<?, ?> colSach_GiaBia;
    @FXML
    private TableColumn<?, ?> colSach_NgayXuatBan;
    @FXML
    private TextField txfSach_Ma;
    @FXML
    private TextField txfSach_Ten;
    @FXML
    private TextField txfSach_NXB;
    @FXML
    private TextField txfSach_TacGia;
    @FXML
    private TextField txfSach_NgonNgu;
    @FXML
    private TextField txfSach_GiaBia;
    @FXML
    private TextField txfSach_NgayXuatBan;
    @FXML
    private Button btnSach_ChiTiet;
    @FXML
    private Tab tabThanhVien;
    @FXML
    private TableView<?> tableThanhVien;
    @FXML
    private TableColumn<?, ?> colThanhVien_Ma;
    @FXML
    private TableColumn<?, ?> colThanhVien_Ten;
    @FXML
    private TableColumn<?, ?> colThanhVien_GioiTinh;
    @FXML
    private TableColumn<?, ?> colThanhVien_NgaySinh;
    @FXML
    private TableColumn<?, ?> colThanhVien_CMND;
    @FXML
    private TableColumn<?, ?> colThanhVien_HSSV;
    @FXML
    private TableColumn<?, ?> colThanhVien_SDT;
    @FXML
    private TableColumn<?, ?> colThanhVien_DiaChi;
    @FXML
    private TableColumn<?, ?> colThanhVien_Email;
    @FXML
    private TextField tabThanhVien_Ten;
    @FXML
    private TextField txfThanhVien_GioiTinh;
    @FXML
    private TextField txfThanhVien_NgaySinh;
    @FXML
    private TextField txfThanhVien_CMND;
    @FXML
    private TextField txfThanhVien_HSSV;
    @FXML
    private TextField txfThanhVien_SDT;
    @FXML
    private TextField txfThanhVien_DiaChi;
    @FXML
    private TextField txfThanhVien_Email;
    @FXML
    private TextField txfThanhVien_Ma;
    @FXML
    private Tab tabNhanVien;
    @FXML
    private TableView<?> tableNhanVien;
    @FXML
    private TableColumn<?, ?> colNhanVien_TaiKhoan;
    @FXML
    private TableColumn<?, ?> colNhanVien_Ten;
    @FXML
    private TableColumn<?, ?> colNhanVien_GioiTinh;
    @FXML
    private TableColumn<?, ?> colNhanVien_NgaySinh;
    @FXML
    private TableColumn<?, ?> colNhanVien_CMND;
    @FXML
    private TableColumn<?, ?> colNhanVien_SDT;
    @FXML
    private TableColumn<?, ?> colNhanVien_Email;
    @FXML
    private TextField txfNhanVien_TenTaiKhoan;
    @FXML
    private TextField txfNhanVien_Ten;
    @FXML
    private TextField txfNhanVien_GioiTinh;
    @FXML
    private TextField txfNhanVien_NgaySinh;
    @FXML
    private TextField txfNhanVien_CMND;
    @FXML
    private TextField txfNhanVien_SDT;
    @FXML
    private TextField txfNhanVien_Email;
    @FXML
    private Tab tabPhieuThue;
    @FXML
    private TableView<?> tablePhieuThue;
    @FXML
    private TableColumn<?, ?> colPhieuThue_Ma;
    @FXML
    private TableColumn<?, ?> colPhieuThue_Ten;
    @FXML
    private TableColumn<?, ?> colPhieuThue_TaiKhoan;
    @FXML
    private TableColumn<?, ?> colPhieuThue_NgayThue;
    @FXML
    private TableColumn<?, ?> colPhieuThue_NgayTra;
    @FXML
    private TableColumn<?, ?> colPhieuThue_TinhTrang;
    @FXML
    private TableColumn<?, ?> colPhieuThue_TienThue;
    @FXML
    private TextField txfPhieuThue_MaThanhVien;
    @FXML
    private TextField txfPhieuThue_TenNguoiThue;
    @FXML
    private TextField txfPhieuThue_TaiKhoan;
    @FXML
    private TextField txfPhieuThue_TenNhanVien;
    @FXML
    private TextField txfPhieuThue_NgayThue;
    @FXML
    private TextField txfPhieuThue_NgayTra;
    @FXML
    private TextField txfPhieuThue_TinhTrang;
    @FXML
    private TextField txfPhieuThue_TienThue;
    @FXML
    private Button btnPhieuThue_ChiTiet;
    @FXML
    private TextField txfPhieuThue_Ma;
    @FXML
    private Tab tabPhieuNhap;
    @FXML
    private TableView<?> tablePhieuNhap;
    @FXML
    private TableColumn<?, ?> colPhieuNhap_Ma;
    @FXML
    private TableColumn<?, ?> colPhieuNhap_TaiKhoan;
    @FXML
    private TableColumn<?, ?> colPhieuNhap_NgayNhap;
    @FXML
    private TableColumn<?, ?> colPhieuNhap_GiaNhap;
    @FXML
    private Button btnPhieuNhap_ChiTiet;
    @FXML
    private TextField txfPhieuNhap_Ma;
    @FXML
    private TextField txfPhieuNhap_TaiKhoan;
    @FXML
    private TextField txfPhieuNhap_TenNhanVien;
    @FXML
    private TextField txfPhieuNhap_NgayNhap;
    @FXML
    private TextField txfPhieuNhap_GiaNhap;
        
    //KHAI BÁO THUỘC TÍNH ĐỂ ĐIỀU KHIỂN FORM
    //Controller Properties
    private int _selectedTab;
    
    //Controller Model
    private SingleSelectionModel<Tab> _tabSelectionModel;
    
    //Dialog Stage
    FXMLLoader fxmlLoader;
    Parent newScene;
    Stage newStage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO     
        _selectedTab = 0;        
        _tabSelectionModel = tabTabPane.getSelectionModel();        
    }        
   
    /**
     * Chức năng cho các nút thêm / xóa / sửa
     * @param event
     * @throws IOException 
     */
    @FXML
    private void btnThemOnAction(ActionEvent event) throws IOException {
        switch(_selectedTab) {
            case 0:
                //Load fxml và controller của file fxml
                fxmlLoader = new FXMLLoader(getClass().getResource("../ThemSach_UI.fxml"));
                
                //Tạo node
                newScene = (Parent) fxmlLoader.load();
                
                //Tạo stage
                newStage = new Stage();
                newStage.setScene(new Scene(newScene));                
                newStage.initModality(Modality.APPLICATION_MODAL);
                newStage.showAndWait();
                break;
            case 1:
                //Load fxml và controller của file fxml
                fxmlLoader = new FXMLLoader(getClass().getResource("../ThemThanhVien_UI.fxml"));
                
                //Tạo node
                newScene = (Parent) fxmlLoader.load();
                
                //Tạo stage
                newStage = new Stage();
                newStage.setScene(new Scene(newScene));                
                newStage.initModality(Modality.APPLICATION_MODAL);
                newStage.showAndWait();
                break;
            case 2:
                //Load fxml và controller của file fxml
                fxmlLoader = new FXMLLoader(getClass().getResource("../ThemNhanVien_UI.fxml"));
                
                //Tạo node
                newScene = (Parent) fxmlLoader.load();
                
                //Tạo stage
                newStage = new Stage();
                newStage.setScene(new Scene(newScene));                
                newStage.initModality(Modality.APPLICATION_MODAL);
                newStage.showAndWait();
                break;
            case 3:
                //Load fxml và controller của file fxml
                fxmlLoader = new FXMLLoader(getClass().getResource("../ThemPhieuThue_UI.fxml"));
                
                //Tạo node
                newScene = (Parent) fxmlLoader.load();
                
                //Tạo stage
                newStage = new Stage();
                newStage.setScene(new Scene(newScene));                
                newStage.initModality(Modality.APPLICATION_MODAL);
                newStage.showAndWait();
                break;
            case 4:
                //Load fxml và controller của file fxml
                fxmlLoader = new FXMLLoader(getClass().getResource("../ThemPhieuNhap_UI.fxml"));
                
                //Tạo node
                newScene = (Parent) fxmlLoader.load();
                
                //Tạo stage
                newStage = new Stage();
                newStage.setScene(new Scene(newScene));                
                newStage.initModality(Modality.APPLICATION_MODAL);
                newStage.showAndWait();
                break;
        }
    }

    @FXML
    private void btnXoaOnAction(ActionEvent event) {
    }

    @FXML
    private void btnSuaOnAction(ActionEvent event) throws IOException {
        switch(_selectedTab) {
            case 0:
                //FXML
                fxmlLoader = new FXMLLoader(getClass().getResource("../ThemSach_UI.fxml"));
                         
                //Tạo node
                newScene = (Parent) fxmlLoader.load();                                
                
                //Tạo stage
                newStage = new Stage();
                newStage.setScene(new Scene(newScene));                
                newStage.initModality(Modality.APPLICATION_MODAL);
                
                //FXML Controller
                ThemSach_UIController themSachUI_Controller = fxmlLoader.<ThemSach_UIController>getController();                
                themSachUI_Controller.cheDoSua(true, "");
                
                newStage.showAndWait();
                break;
            case 1:
                //FXML
                fxmlLoader = new FXMLLoader(getClass().getResource("../ThemThanhVien_UI.fxml"));
                         
                //Tạo node
                newScene = (Parent) fxmlLoader.load();                                
                
                //Tạo stage
                newStage = new Stage();
                newStage.setScene(new Scene(newScene));                
                newStage.initModality(Modality.APPLICATION_MODAL);
                
                //FXML Controller
                ThemThanhVien_UIController themThanVienUI_Controller = fxmlLoader.<ThemThanhVien_UIController>getController();                
                themThanVienUI_Controller.cheDoSua(true, "");
                
                newStage.showAndWait();
                break;
            case 2:
                //FXML
                fxmlLoader = new FXMLLoader(getClass().getResource("../ThemNhanVien_UI.fxml"));
                         
                //Tạo node
                newScene = (Parent) fxmlLoader.load();                                
                
                //Tạo stage
                newStage = new Stage();
                newStage.setScene(new Scene(newScene));                
                newStage.initModality(Modality.APPLICATION_MODAL);
                
                //FXML Controller
                ThemNhanVien_UIController themNhanVienUI_Controller = fxmlLoader.<ThemNhanVien_UIController>getController();                
                themNhanVienUI_Controller.cheDoSua(true, "");
                
                newStage.showAndWait();
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    /**
     * Sự kiện cho các nút chức năng tìm kiếm
     * @param event 
     */
    @FXML
    private void btnTimKiemOnAction(ActionEvent event) {
    }

    @FXML
    private void btnCaiDatTimKiemOnAction(ActionEvent event) {
    }

    /**
     * Bắt sự kiện khi chuyển qua lại giữa các tab
     * @param event 
     */
    @FXML
    private void tabSachChanged(Event event) {        
        try {
            _selectedTab = _tabSelectionModel.getSelectedIndex();    
            btnXoa.setDisable(false);
            btnSua.setDisable(false);
        } catch (NullPointerException ex) {
            //Rỗng
        }
    }

    @FXML
    private void tabThanhVienChanged(Event event) {
        _selectedTab = _tabSelectionModel.getSelectedIndex();
        btnXoa.setDisable(false);
        btnSua.setDisable(false);
    }

    @FXML
    private void tabNhanVienChanged(Event event) {
        _selectedTab = _tabSelectionModel.getSelectedIndex();
        btnXoa.setDisable(false);
        btnSua.setDisable(false);
    }

    @FXML
    private void tabPhieuThueChanged(Event event) {
        _selectedTab = _tabSelectionModel.getSelectedIndex();
        btnXoa.setDisable(true);
        btnSua.setDisable(true);
    }

    @FXML
    private void tabPhieuNhapChanged(Event event) {
        _selectedTab = _tabSelectionModel.getSelectedIndex();
        btnXoa.setDisable(true);
        btnSua.setDisable(true);
    }       
}
