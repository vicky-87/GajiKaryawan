/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author AHMAD ROFIKIL KHOIRI
 */
public class GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    
    System.out.println("==========================");
    System.out.println("*Menghitung Gaji Karyawan*");
    System.out.println("==========================");
    System.out.println();
     
    String nama;
    char golongan;
    int jam_kerja = 0, upah_per_jam = 0, total_upah;
     
    System.out.print("Nama Karyawan: ");
    nama = input.nextLine();
     
    System.out.println("Golongan: ");
    System.out.println("1. Indonesia");
    System.out.println("2. Vietnam");
    golongan = input.next().charAt(0);  
     
    System.out.print("Jumlah jam kerja: ");
    jam_kerja = input.nextInt();    
     
    System.out.println();
     
     // tentukan jumlah upah per jam berdasarkan golongan
    switch (golongan) {
      case '1':
        upah_per_jam = 285000;
        break;
      case '2':
        upah_per_jam = 318000;
        break;
    }
       
    total_upah = jam_kerja * upah_per_jam;
      
    // cek apakah jam kerja lebih dari 50 jam
    if ( (jam_kerja - 50) > 0 ) {
       total_upah = total_upah + ((jam_kerja - 50)*30000000);
    }
     
    // proses output
    System.out.println(nama + " menerima upah Rp." + total_upah 
                       + " per bulan");
    }
    
}
