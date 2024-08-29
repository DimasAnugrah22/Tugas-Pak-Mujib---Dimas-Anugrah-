/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Tugas8Soal2;

/**
 *
 * @author iMOp
 */
import java.util.Scanner;

public class Tugas8Soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = scanner.nextInt();

        System.out.print("Tahun Awal ?: ");
        int tahunAwal = scanner.nextInt();

        System.out.println("Hasil nya : ");


        for (int i = tahunAkhir; i >= tahunAwal; i--) {
            System.out.println(i);
        }
    }
}
