/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttm.threading.wosyncro;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teguhteja
 */
public class TanpaSync {
    public static void main(String[] args){
        KotakSurat ks = new KotakSurat();
        TukangPos tp = new TukangPos(ks);
        TuanRumah tr = new TuanRumah(ks);
        
        new ThreadTukangPos(tp).start();
        new ThreadTuanRumah(tr).start();
    }
}    
    class ThreadTukangPos extends Thread{
        private TukangPos tukangPos;
        public ThreadTukangPos(TukangPos t){
            this.tukangPos = t;
        }
        
        @Override
        public void run(){
            Random r = new Random();
            int ulangi = 10;
            for(int i = 0; i < ulangi; i++){
                tukangPos.taruh();
                tukangPos.lihat();
                try {
                    Thread.sleep(r.nextInt(10)*1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TanpaSync.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    class ThreadTuanRumah extends Thread{
        private TuanRumah tuanRumah;
        public ThreadTuanRumah(TuanRumah t){
            this.tuanRumah = t;
        }
        
        @Override
        public void run(){
            Random r = new Random();
            int ulangi = 10;
            for(int i = 0; i < ulangi; i++){
                tuanRumah.ambil();
                tuanRumah.lihat();
                try {
                    Thread.sleep(r.nextInt(10)*1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TanpaSync.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

