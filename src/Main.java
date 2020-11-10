/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program menghitung hukum ohm
 * berbasis OOP
 */

public class Main {
    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        Baterai baterai1 = new Baterai(3f, 12f);

        System.out.println("Kuat Arus : " + baterai1.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + baterai1.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + baterai1.hitungTegangan() + " volt");
    }
}
