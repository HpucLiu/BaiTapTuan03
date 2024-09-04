/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bt02;

import java.io.*;
import java.util.ArrayList;
import Bt01.SanPham;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class WriteObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Bt01.SanPham> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap SP thu : " + (i + 1));
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
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            for (SanPham sp : ds) {
                os.writeObject(sp.getMaSo() + ";" + sp.getTen() + ";" + sp.getGia() + "\n");
            }
            fos.close();
            System.out.println("Ghi file thanh cong ");

        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex);
            System.out.println("Ghi file that bai");
        }
    }

}
