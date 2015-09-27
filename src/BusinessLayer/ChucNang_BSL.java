/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import java.util.ArrayList;

/**
 *
 * @author Phan Phat
 */
public interface ChucNang_BSL<E> {
    /**
     * Lấy dữ liệu từ Database
     * @return Mảng các phần tử
     */
    public ArrayList<E> layDuLieu();
    
    /**
     * Thêm dữ liệu vào Database
     */
    public void themDuLieu(E object);
    
    /**
     * Xóa dữ liệu khỏi Database
     */
    public void xoaDuLieu(String id);
    
    /**
     * Sửa dữ liệu trên Database
     */
    public void suaDuLieu(E object);
}
