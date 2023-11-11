import java.util.ArrayList;
import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
        ArrayList<String> jalurOperasional = new ArrayList<>();
        jalurOperasional.add("Sukabumi");
        jalurOperasional.add("Cianjur");
        jalurOperasional.add("Bandung");
        jalurOperasional.add("Garut");
        jalurOperasional.add("Tasik");
        jalurOperasional.add("Ciamis");
        jalurOperasional.add("Banjar");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kota keberangkatan: ");
        String kotaKeberangkatan = scanner.nextLine();
        if (!jalurOperasional.contains(kotaKeberangkatan)) {
            System.out.println("Kota keberangkatan tidak valid");
            return;
        }

        System.out.print("Kota tujuan: ");
        String kotaTujuan = scanner.nextLine();
        if (!jalurOperasional.contains(kotaTujuan)) {
            System.out.println("Kota tujuan tidak valid");
            return;
        }

        System.out.print("Apakah penumpang anggota TNI atau Polri (ya/tidak): ");
        String anggotaTNIPOLRI = scanner.nextLine();
        boolean isAnggotaTNIPOLRI = anggotaTNIPOLRI.equalsIgnoreCase("ya");

        double tarif = 0;

        if (kotaKeberangkatan.equals("Sukabumi") && kotaTujuan.equals("Banjar")) {
            tarif = 0.95 * 10000; 
        } else {
            if (kotaKeberangkatan.equals("Sukabumi") && kotaTujuan.equals("Cianjur")) {
                tarif = 10000;
            } else if (kotaKeberangkatan.equals("Cianjur") && kotaTujuan.equals("Bandung")) {
                tarif = 15000;
            } else if (kotaKeberangkatan.equals("Bandung") && kotaTujuan.equals("Garut")) {
                tarif = 7500;
            } else if (kotaKeberangkatan.equals("Garut") && kotaTujuan.equals("Tasik")) {
                tarif = 5000;
            } else if (kotaKeberangkatan.equals("Tasik") && kotaTujuan.equals("Ciamis")) {
                tarif = 7500;
            } else if (kotaKeberangkatan.equals("Ciamis") && kotaTujuan.equals("Banjar")) {
                tarif = 6000;
            }
        }

        if (isAnggotaTNIPOLRI) {
            tarif *= 0.9; 
        }

        System.out.println("Harga tiket: " + tarif);
    }
}

//Sena Fajar Santika
//20230040011
//TI23A