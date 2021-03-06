package Models;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anuge
 */
public class Perjalanan {
    private ArrayList<Pelanggan> pelanggan = new ArrayList<>();
    private PaketWisata paket;
    private double totalHarga;
    private double harga;
    private String idPerjalanan;

    public Perjalanan(double aDouble, double aDouble0, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdPerjalanan() {
        return idPerjalanan;
    }

    public void setIdPerjalanan(String idPer) {
        this.idPerjalanan = idPerjalanan;
    }
    
    public void addPelanggan(Pelanggan p){
        if (pelanggan.size() < 5) pelanggan.add(p);
        else System.out.println("Penuh");
    }
    
    public Pelanggan getPelangganIndex(int n){
        return pelanggan.get(n);
    }
    
    public Pelanggan getPelangganId(String idPlg){
        Pelanggan pg = null;
	for (Pelanggan p : pelanggan) {
            if (p.getIdPelanggan() == idPlg) {
		pg = p;
		break;
            }
        }
        return pg;
    }
    
    public void setPaket(PaketWisata p){
        paket = p;
    }
    
    public PaketWisata getPaket(){
        return paket;
    }
    
    public void setHarga(double harga){
        this.harga = harga + paket.getHargaWisata();
    }
    
    public double getHarga(){
        return harga;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
    
}
