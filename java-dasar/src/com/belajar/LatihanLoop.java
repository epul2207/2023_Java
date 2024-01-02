package com.belajar;

public class LatihanLoop {
    public static void main(String[] args) {
        System.out.println("Latihan Loop");

        int total = 0;
        int nilai_awal = 1;
        int nilai_akhir = 5;

        while (nilai_awal <= nilai_akhir){
            total = total + nilai_awal;

            System.out.println("nilai awal " + nilai_awal + " Nilai " + total);
            nilai_awal++;
        }
    }
}
