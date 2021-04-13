/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1_205314102;

/**
 *
 * @author
 */
public class RumahSakit {

    private String kodeRS, namaRS, kotaRS;
    private Pasien[] daftarPasien;

    public RumahSakit(String kodeRS, String namaRS) {
        this.kodeRS = kodeRS;
        this.namaRS = namaRS;
    }

    public void setNamaRS(String namaRS) {
        this.namaRS = namaRS;

    }

    public String getNamaRS() {
        return namaRS;
    }

    public void setKotaRS(String kotaRS) {
        this.kotaRS = kotaRS;

    }

    public String getKotaRS() {
        return kotaRS;
    }

    public void setKodeRS(String kodeRS) {
        this.kodeRS = kodeRS;

    }

    public String getKodeRS() {
        return kodeRS;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;

    }

    public Pasien[] getDaftarPasien() {
        return daftarPasien;
    }
    
    
    public static double rataRata(Pasien[] pasien) {
        double total = 0;

        for (Pasien pasien1 : pasien) {
            total += pasien1.getUmur();
        }

        return total / pasien.length;
    }

    public static Pasien older(Pasien[] pasien) {
        Pasien older;
        older = pasien[0];
        for (Pasien pasien1 : pasien) {
            if (pasien1.getUmur() > older.getUmur()) {
                older = pasien1;
            }

        }
        return older;

    }


}
