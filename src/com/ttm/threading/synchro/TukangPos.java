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
public class TukangPos {
    private KotakSurat kotakSurat;
    
    public TukangPos(KotakSurat ks){
        this.kotakSurat = ks;
    }
    
    public void taruh(){
        System.out.println("Tukang Pos menaruh surat");
        kotakSurat.taruhSurat();
    }
    
    public void lihat(){
        kotakSurat.tampilkanIsi();
    }
}
