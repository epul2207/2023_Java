package com.belajar;

public class WhileLoop {
    public static void main(String[] args) {
        int a = 0;

        boolean kondisi = true;

        while (kondisi){

            System.out.println("Perulangan ke - " + a);
            if(a == 100){
                kondisi = false;
            }
            a++;
        }
    }
}
