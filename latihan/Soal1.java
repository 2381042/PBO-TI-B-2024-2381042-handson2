package latihan;

import java.util.Scanner;

public class Soal1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan angka pertama: ");
            int angkaPertama = scanner.nextInt();

            System.out.println("Masukkan angka kedua: ");
            int angkaKedua = scanner.nextInt();

            if (angkaPertama > angkaKedua) {
                System.out.println("Angka pertama adalah angka terbesar ");
            } else if (angkaKedua > angkaPertama) {
                System.out.println("Angka kedua adalah angka terbesar ");
            } else {
                System.out.println("Kedua angka adalah sama ");

            }

        }
}
