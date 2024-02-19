/*
Nama : Eka Nurul Baridah
NIM  : 2206789
Kelas : PILKOM 4A

SOAL 2
Buatlah algoritma dalam Bahasa Java Anda akan keluar membeli gorengan jika
mempunyai uang lebih besar dari 5000 (rupiah) dan hari tidak hujan, yang dapat ditulis
sebagai ekspresi: (uang > 5000) && (!hujan)
*/

package duagorengan;

import java.util.Scanner;

public class DuaGorengan {

    public static void main(String[] args) {

        Scanner gorengan = new Scanner(System.in);

        System.out.print("Jumlah uang yang dimiliki (rupiah): ");
        int uang = gorengan.nextInt();

        System.out.print("Apakah hari hujan? (iya/tidak): ");
        String jawabanHujan = gorengan.next();

        // Memeriksa kondisi untuk membeli gorengan
        if (uang > 5000 && jawabanHujan.equals("tidak")) {
            System.out.println("Yeay ! Anda bisa keluar untuk membeli gorengan");
        } else {
            if (uang <= 5000 && jawabanHujan.equals("iya")) {
                System.out.println("Maaf, Anda tidak bisa membeli gorengan karena uang Anda tidak cukup dan sedang hujan");
            } else if (uang <= 5000) {
                System.out.println("Maaf, Anda tidak bisa membeli gorengan karena uang Anda tidak cukup");
            } else if (jawabanHujan.equals("iya")) {
                System.out.println("Maaf, Anda tidak bisa membeli gorengan karena diluar sedang hujan");
            } else {
                System.out.println("Maaf, inputan salah, coba lagi");
            }
        }

        gorengan.close();
    }
}