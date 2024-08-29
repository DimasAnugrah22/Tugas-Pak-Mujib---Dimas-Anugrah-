/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Tugas14Soal1;

/**
 *
 * @author iMOp
 */

public class Tugas14Soal1 extends abstrakHewan{
    public void suara() {
        System.out.println("Suara T-rex RAWWRR!!!");
    }
    
    public static void main(String[] args) {
        abstrakHewan objek = new Tugas14Soal1();
        objek.suara();
        objek.suara2();
    }
}
