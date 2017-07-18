/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttm.threading.synchro;

import com.ttm.threading.wosyncro.*;

/**
 *
 * @author teguhteja
 */
public class TuanRumah {
    private KotakSurat kotakSurat;
    
    public TuanRumah(KotakSurat ks){
        this.kotakSurat = ks;
    }
    
    public void ambil(){
        System.out.println("Tuan Rumah mengambil surat");
        kotakSurat.ambilSurat();
    }
    
    public void lihat(){
        kotakSurat.tampilkanIsi();
    }
}
