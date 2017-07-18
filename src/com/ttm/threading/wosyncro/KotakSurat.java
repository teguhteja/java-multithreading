/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttm.threading.wosyncro;

/**
 *
 * @author teguhteja
 */
public class KotakSurat {
    private Integer jumlahSurat = 0;
    
    public void taruhSurat(){
        jumlahSurat++;
    }
    
    public void ambilSurat(){
        if(jumlahSurat>0)
            jumlahSurat--;
    }
    
    public void tampilkanIsi(){
        System.out.println("Isi kotak :"+jumlahSurat);
    }
}
