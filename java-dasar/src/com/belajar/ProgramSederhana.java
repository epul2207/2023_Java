package com.belajar;

import java.util.Scanner;

public class ProgramSederhana {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Program Sederhana Luas Persegi Panjang");
        System.out.print("Masukan nilai panjang : ");
        int panjang = inputUser.nextInt();
        System.out.print("Masukan nilai lebar : ");
        int lebar = inputUser.nextInt();
        int luas = panjang * lebar;
        System.out.println("Hasil dari luas tersebut adalah : " + luas);
    }
}
