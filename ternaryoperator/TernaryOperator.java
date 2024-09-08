package ternaryoperator;

public class TernaryOperator {
    public static void main(String[] args) {
        int nilai = 75;
        String gradeNilaiPbo = "A";
        String hasil = gradeNilaiPbo.equals("A") ?  "Lulus" : "Tidak Lulus";


        String outputHasil = "Hasil ujian :";
        System.out.println("Hasil Ujian : " + hasil);
    }
}
