package latihan;

import java.util.Scanner;

    public class Soal3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Kalkulator sederhana");
            System.out.println("Pilih operasi yang diinginkan");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Modulus (%)");

            System.out.println("Masukkan pilihan oparasi (1-5) : ");
            int pilihanOperasi = scanner.nextInt();

            System.out.print("Masukkan angka pertama: ");
            int angkaPertama = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int angkaKedua = scanner.nextInt();

            int hasilOperasi = 0;

            switch (pilihanOperasi) {
                case 1:
                    hasilOperasi = angkaPertama + angkaKedua;
                    System.out.println("Hasil penjumlahan: " + hasilOperasi);
                    break;

                case 2:
                    hasilOperasi = angkaPertama - angkaKedua;
                    System.out.println("Hasil pengurangan: " + hasilOperasi);
                    break;

                case 3:
                    hasilOperasi = angkaPertama * angkaKedua;
                    System.out.println("Hasil perkalian: " + hasilOperasi);
                    break;

                case 4:
                    if (angkaKedua != 0) {
                        hasilOperasi = angkaPertama / angkaKedua;
                        System.out.println("Hasil pembagian: " + hasilOperasi);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                case 5:
                    if (angkaKedua != 0) {
                        hasilOperasi = angkaPertama % angkaKedua;
                        System.out.println("Hasil modulus: " + hasilOperasi);
                    } else {
                        System.out.println("Error: Modulus dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            scanner.close();
        }

    }