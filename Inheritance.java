package inheritance;

import java.util.Scanner;

public class Inheritance {

    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        Segitiga sg = new Segitiga();
        Scanner scanner = new Scanner(System.in);
        bangunDatar BangunDatar = new bangunDatar();
        System.out.println("1. Luas Persegi");
        System.out.println("2. Keliling Persegi");
        System.out.println("3. Luas Persegi Panjang");
        System.out.println("4. Keliling Persegi Panjang");
        System.out.println("5. Luas Lingkaran");
        System.out.println("6. Keliling Lingkaran");
        System.out.println("7. Luas Segitiga");
        System.out.print("Yang ingin dihitung : ");
        int pilih = scanner.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan sisi: ");
                persegi.sisi = scanner.nextInt();
                persegi.luas();
                break;
            case 2:
                System.out.print("Masukkan sisi: ");
                persegi.sisi = scanner.nextInt();
                persegi.keliling();
                break;
            case 3:
                System.out.print("Masukkan Panjang : ");
                pp.panjang = scanner.nextInt();
                System.out.print("Masukkan Lebar : ");
                pp.lebar = scanner.nextInt();
                pp.luas();
                break;
            case 4:
                System.out.print("Masukkan Panjang : ");
                pp.panjang = scanner.nextInt();
                System.out.print("Masukkan Lebar : ");
                pp.lebar = scanner.nextInt();
                pp.keliling();
                break;
            case 5:
                System.out.print("Masukkan Jari-jari : ");
                lingkaran.r = scanner.nextInt();
                lingkaran.luas();
                break;
            case 6:
                System.out.print("Masukkan Jari-jari : ");
                lingkaran.r = scanner.nextInt();
                lingkaran.keliling();
                break;
            case 7:
                System.out.print("Masukkan Alas : ");
                sg.alas = scanner.nextInt();
                System.out.print("Masukkan Tinggi : ");
                sg.tinggi = scanner.nextInt();
                sg.luas();
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

    }

}
