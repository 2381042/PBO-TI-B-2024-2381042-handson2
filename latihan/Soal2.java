package latihan;

import java.util.Scanner;

    public class Soal2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan bilangan pertama ");
            int bilanganPertama = scanner.nextInt();

            System.out.println("Masukkan bilangan kedua");
            int bilanganKedua = scanner.nextInt();

            System.out.println("Masukkan bilangan ketiga:");
            int bilanganKetiga = scanner.nextInt();

            int maksimum = bilanganPertama;

            if (bilanganKedua > maksimum) {
                maksimum = bilanganKedua;
            }
            if (bilanganKetiga > maksimum) {
                maksimum = bilanganKetiga;
            }
            System.out.println("Bilangan maksimum adalah: " + maksimum);
        }
    }

