/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23176004_anandarifat_si3;

import java.util.Scanner;

/**
 * NAMA: ANANDA RIFAT AULIA
 * NIM: 23176004
 * PRODI: SISTEM INFORMASI
 * SEMESTER: 3
 * DESKRIPSI PROGRAM: PROGRAM INI BERISI TENTANG MENGHITUNG LUAS, JARI-JARI, DAN KELILING DARI LINGKARAN
 * @author ananda rifat aulia
 */
public class PERHITUNGAN_LINGKARAN_22_23176004_RIFAT {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean inputValid = false;
        double diameter = 0;

            System.out.println("====== Perhitungan Lingkaran ======");
        
        // Loop untuk validasi input
        while (!inputValid) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String inputDiameter = input.nextLine();

            try {
                // Mencoba mengonversi input menjadi angka
                diameter = Double.parseDouble(inputDiameter);
                if (diameter > 0) {
                    inputValid = true; // Jika input valid
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                    System.out.println(); // Menambahkan jarak kosong
                }
            } catch (NumberFormatException e) {
                // Jika input bukan angka
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println(); // Menambahkan jarak kosong
            }
        }

        // Jika input valid, lakukan perhitungan
        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2); // Luas lingkaran = πr²
        double keliling = 2 * Math.PI * jariJari; // Keliling lingkaran = 2πr

        // Menampilkan hasil
        System.out.println("====== Hasil Perhitungan Lingkaran ======");
        System.out.printf("Jari-jari Lingkaran = %.2f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm^2%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);

        input.close(); // Menutup scanner
        System.out.println("Halo Aku Ananda Rifat Aulia");
    }
}   

