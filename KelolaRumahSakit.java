/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1_205314102;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;

public class KelolaRumahSakit {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //.....Membuat inputan banyak pasien
        System.out.print("Masukan Jumlah Pasien : ");
        int nPasien = keyboard.nextInt();
        System.out.println();

        //.....Membuat array data pasien
        Pasien[] dataPasien;
        dataPasien = new Pasien[nPasien];

        //.....Membuat inputan data pasien
        System.out.println("===================================================================");
        for (int i = 0; i < dataPasien.length; i++) {

            System.out.print("Masukan NIK Pasien  Ke  -  " + (i + 1) + " : ");
            String nikPasien = keyboard.next();
            System.out.print("Masukan Nama Pasien Ke -   " + (i + 1) + " : ");
            String namaPasien = keyboard.next();
            System.out.print("Masukan Usia Pasien Ke -   " + (i + 1) + " : ");
            int umurPasien = keyboard.nextInt();

            dataPasien[i] = new Pasien(nikPasien, namaPasien);
            dataPasien[i].setUmur(umurPasien);

        }
        System.out.println("===================================================================");
        System.out.println();

        //.....Membuat obyek Rumah Sakit
        System.out.println("===================================================================");
        System.out.println("\t \t INPUT DATA RUMAH SAKIT");

        //.....Membuat Inputan Info Rumah Sakit
        System.out.println("===================================================================");
        System.out.print("Kode Rumah Sakit    :   ");
        String kode = keyboard.next();
        System.out.print("Nama Rumah Sakit    :   ");
        String nama = keyboard.next();
        System.out.print("Kota Rumah Sakit    :   ");
        String kota = keyboard.next();
        System.out.println("===================================================================");
        System.out.println();

        RumahSakit infoRS = new RumahSakit(kode, nama);
        infoRS.setKotaRS(kota);
        //.....Mengeset daftar pasien ke class Rumah Sakit
        infoRS.setDaftarPasien(dataPasien);

        //.....Output Informasi Rumah Sakit
        System.out.println("===================================================================");
        System.out.println("\t \t INFORMASI RUMAH SAKIT DAN PASIEN");
        System.out.println("===================================================================");
        System.out.println("Rumah Sakit " + infoRS.getNamaRS() + " Kota " + infoRS.getKotaRS());
        System.out.println("\t \t Daftar Pasien : ");
        System.out.println("===================================================================");
        System.out.println("NIK \t Nama \t Usia");
        System.out.println("===================================================================");
        //.....Membuat Output Daftar Pasien.....
        for (int i = 0; i < dataPasien.length; i++) {
            System.out.println((i + 1) + " \t " + infoRS.getDaftarPasien()[i].getNama() + " \t " + infoRS.getDaftarPasien()[i].getUmur());

        }
        System.out.println("===================================================================");
        System.out.println();
        System.out.println("Jumlah Pasien Adalah             : " + nPasien);
        System.out.println("Rata Rata Umur Pasien Adalah     : " + RumahSakit.rataRata(dataPasien));
        System.out.println("Pasien Dengan Umur Tertua Adalah : " + RumahSakit.older(dataPasien).getNama());

    }

}
