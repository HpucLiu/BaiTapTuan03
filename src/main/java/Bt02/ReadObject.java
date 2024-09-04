/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bt02;

import Bt01.SanPham;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ds = (ArrayList<SanPham>)ois.readObject();
            fis.close();
            System.out.println("Doc file thanh cong");
            for (SanPham d : ds) {
                System.out.println(d);
            }
        } catch (Exception ex) {
            System.out.println("Loi xay ra: "+ex.toString());
            System.out.println("Doc File that bai");
        }
    }
    
}
