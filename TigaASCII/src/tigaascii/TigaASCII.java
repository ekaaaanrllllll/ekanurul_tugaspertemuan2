/*
Nama : Eka Nurul Baridah
NIM  : 2206789
Kelas : PILKOM 4A

SOAL 3
Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘1’ dan
karakter ‘2’!
*/

package tigaascii;

import java.util.Scanner;

public class TigaASCII {

    public static void main(String[] args) {
        char satu = '1';
        char dua = '2';

        int asciiSatu = (int) satu;
        int asciiDua = (int) dua;

        int total = asciiSatu + asciiDua;

        System.out.println("Hasil penjumlahan ASCII dari '1' dan '2' = " + total);
    }
}