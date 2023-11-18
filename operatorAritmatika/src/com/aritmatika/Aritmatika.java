package com.aritmatika;

public class Aritmatika {
    public static void main(String[] args) {
        int nilai1 = 5;
        int nilai2 = 2;
        int hasil;
        System.out.println("Belajar Aritmatika di Java");
        //1.Penjumlahan
        System.out.println("1. Penjumlahan ");
        hasil = nilai1 + nilai2;
        System.out.println("Penjumlahan dari " + nilai1 + " + " + nilai2 + " = " + hasil);
        System.out.println("=========================================");
        System.out.println("2. Pengurangan");
        hasil = nilai1 - nilai2;
        System.out.println("Pengurangan dari " + nilai1 + " - " + nilai2 + " = " + hasil);
        System.out.println("=========================================");
        System.out.println("3. Perkalian");
        hasil = nilai1 * nilai2;
        System.out.println("Perkalian dari " + nilai1 + " X " + nilai2 + " = " + hasil);
        System.out.println("=========================================");
        System.out.println("4. Pembagian");
        hasil = nilai1 / nilai2;
        System.out.println("Pembagian dari " + nilai1 + " / " +  nilai2 + " = " + hasil);
        System.out.println("=========================================");
        System.out.println("5. Modulus / Sisa Bagi");
        hasil = nilai1 % nilai2;
        System.out.println("Modulus darit " + nilai1 + " % " + nilai2 + " = " + hasil);
    }
}
