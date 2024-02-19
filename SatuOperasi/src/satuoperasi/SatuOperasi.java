/*
Nama : Eka Nurul Baridah
NIM  : 2206789
Kelas : PILKOM 4A

SOAL 1
Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan
bilangan bulat dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!
*/

package satuoperasi;

import java.util.Scanner;

public class SatuOperasi {

    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);

        int a, b, c;
        char jenisOperasi;
        int hasil;

        // Menginput tiga bilangan bulat
        System.out.print("Bilangan bulat pertama: ");
        a = bilangan.nextInt();
        System.out.print("Bilangan bulat kedua: ");
        b = bilangan.nextInt();
        System.out.print("Bilangan bulat ketiga: ");
        c = bilangan.nextInt();

        // Meminta pengguna memilih jenis operasi
        System.out.println("Pilih jenis operasi (+,-,*,/): ");
        jenisOperasi = bilangan.next().charAt(0);

        // Proses, dengan operasi sesuai dengan input pengguna
        switch (jenisOperasi) {
            case '+' -> hasil = a + b + c;
            case '-' -> hasil = a - b - c;
            case '*' -> hasil = a * b * c;
            case '/' -> hasil = a / b / c;
            default -> {
                System.out.println("Masukkan operasi yang valid!");
                return;
            }
        }

        // Print hasil
        System.out.println("Hasil operasi: " + hasil);
    }
}
