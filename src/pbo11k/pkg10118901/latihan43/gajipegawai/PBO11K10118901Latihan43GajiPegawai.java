/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan43.gajipegawai;
/**
 *
 * @author
 * NAMA         : Dedi Cahya
 * NIM          : 10118901
 * Kelas        : PBO11K
 * Deskripsi Program : Menghitung semua gaji karyawan (tunjangan, transport) dengan konsep orientasi objek
 */
public class PBO11K10118901Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Rizki Adam Kurniawan");
        gp.setAlamat("Jalan Semar dlm 4 No 72/66");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        gp.tampilData(gp.getNama(), gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok(), gp.totalGaji(gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok()));
    }
    
}
