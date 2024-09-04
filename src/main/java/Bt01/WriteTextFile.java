/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bt01;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
//        ds.add(new SanPham("Sp01", "Gạo1", 25000));
//        ds.add(new SanPham("Sp02", "Gạo2", 26000));
//        ds.add(new SanPham("Sp03", "Gạo3", 27000));
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap SP thu : "+(i+1));
            System.out.print("Nhap maso SP: ");
            String maSo = sc.nextLine();
            System.out.print("Nhap ten SP: ");
            String ten = sc.nextLine();
            System.out.print("Nhap gia SP: ");
            float gia = sc.nextFloat();
            sc.nextLine();
            SanPham sp = new SanPham(maSo, ten, gia);
            ds.add(sp);
        }

        try {
            FileWriter fw = new FileWriter("sanpham.txt");
            for (SanPham sp : ds) {
                fw.write(sp.getMaSo() + ";" + sp.getTen() + ";" + sp.getGia() + "\n");
            }
            fw.close();
            System.out.println("Ghi file thanh cong ");
            
        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }

}
