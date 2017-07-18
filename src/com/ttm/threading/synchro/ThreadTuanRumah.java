/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttm.threading.synchro;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teguhteja
 */
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
                    Logger.getLogger(DenganSync.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
