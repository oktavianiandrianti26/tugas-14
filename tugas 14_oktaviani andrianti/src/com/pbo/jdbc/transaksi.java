package com.pbo.jdbc;

import java.util.Scanner;


public class transaksi {
    
    private static String username = "admin";
    private static String password = "oktaviani15924";
    private static String captcha = "AbcDe";

    public static void main(String[] args) {
        config.connection();
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String un = scanner.next();
        System.out.print("Password: ");
        String pw = scanner.next();

        if (un.equals(username) && pw.equals(password)) {
           
            System.out.print("Masukkan captcha: ");
            String inputCaptcha = scanner.next();

        
            if (inputCaptcha.equalsIgnoreCase(captcha)) {
                System.out.println("Otentikasi berhasil. Selamat datang, " + un + "!");
            
            while(true){

            System.out.print("\n====== MENU ======\n"
            + "t. Tambah Transaksi\n"
            + "u. Lihat Data Barang\n"
            + "v. Hapus Data Barang\n"
            + "w. Update Data Barang\n"
            + "0. Exit\n"
            + "Pilih[t/u/v/w/0] : ");

            
            String pilihan = scanner.next();

            if( pilihan.equalsIgnoreCase("0") ){
                System.out.println("Thank You!!");
                break;
            }

            switch (pilihan) {
                case "t" :
                    try {
                    
                    view.tambahData();

                } catch (Exception e) {
                    System.err.println("Input tidak valid. Pastikan input sesuai dengan tipe data yang diminta.");
                } 
                    
                    
                    break;
                case "u" :
                    view.getAllData();
                    break;
                case "v" :
                    view.deleteData();
                    break;
                case "w" :
                    view.updateData();
                    break;
                default:
                    System.out.println("Pilihan salah!!");
                    break;
                    
            }
       
        }
           scanner.close();     
            } else {
                System.out.println("Captcha tidak valid. Autentikasi gagal.");
            }
        } else {
            System.out.println("Nama pengguna atau kata sandi tidak valid. Autentikasi gagal.");
        }
    }
    
}