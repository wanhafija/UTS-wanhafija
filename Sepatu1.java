/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepatu;

/**
 *
 * @author ITBI 24
 */
public class Sepatu1 {
    String merk;
    String warna;
    int ukuran;
    
    
    public Sepatu1 (String merk,String warna,int ukuran){
        this.merk=merk;
        this.warna=warna;
        this.ukuran=ukuran;
    }
        
    public void tampilkanInformasiSepatu(){
        System.out.println("merk: "+ merk);
        System.out.println("warna: "+ warna);
        System.out.println("ukuran: "+ ukuran);
    }
    
}
