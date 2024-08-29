/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Tugas13Soal1;

/**
 *
 * @author iMOp
 */
public class Tugas13Soal1 {

    public static void main(String[] args) {
        Kalkulator objek = new Kalkulator();
        System.out.println("Hasil Pertambahan : " + objek.tambah(20, 10));
        System.out.println("Hasil Pengurangan : " + objek.kurang(20, 10));
        System.out.println("Hasil Perkalian : " + objek.kali(20, 10));
        System.out.println("Hasil Pembagian : " + objek.bagi(20, 10));
    }
}
