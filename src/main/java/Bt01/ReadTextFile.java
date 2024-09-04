/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bt01;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;


/**
 *
 * @author ADMIN
 */
public class ReadTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds = new ArrayList<>();
        try {
            FileReader fr = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(fr);
            String data = null;
            while((data = br.readLine()) != null){
                //Tạo đối tượng từ dư liệu đọc được và thêm vào danh sách SP
                String[] arr = data.split(";");
                ds.add(new SanPham(arr[0],arr[1],Float.parseFloat(arr[2])));
            }
            fr.close();
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
