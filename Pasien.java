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
public class Pasien {

    private String NIK, nama;
    private int umur;

    public Pasien(String NIK, String nama) {
        this.nama = nama;
        this.NIK = NIK;
    }

    public void setNama(String nama) {
        this.nama = nama;

    }

    public String getNama() {
        return nama;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;

    }

    public String getNIK() {
        return NIK;
    }
        public void setUmur(int umur ){
        this.umur = umur;
        
    }
    
    public int getUmur(){
        return umur;
    }


}
