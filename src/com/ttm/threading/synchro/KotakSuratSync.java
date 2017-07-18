/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttm.threading.synchro;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teguhteja
 */
public class KotakSuratSync {
    private Integer jumlahSurat = 0;
    private Boolean kosong = true;
    
    public synchronized void taruhSurat(){
        while(!kosong){
            System.out.println("Masih ada isinya, tunggu kosong dulu");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(KotakSuratSync.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Tukang pos menaruh surat");
        jumlahSurat++;
        kosong = false;
        notifyAll();
    }
    
    public synchronized void ambilSurat(){
        while(kosong){
            System.out.println("Belum ada isinya, tunggu diisi dulu");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(KotakSuratSync.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Tuan rumah mengambil surat");
        jumlahSurat--;
        kosong = true;
        notifyAll();
    }
    
    public void tampilkanIsi(){
        System.out.println("Isi kotak :"+jumlahSurat);
    }
}
