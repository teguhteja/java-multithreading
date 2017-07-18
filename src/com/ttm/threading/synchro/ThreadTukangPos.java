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
public class ThreadTukangPos extends Thread{
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
                    Logger.getLogger(DenganSync.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
