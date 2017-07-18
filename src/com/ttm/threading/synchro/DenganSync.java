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
public class DenganSync {
    public static void main(String[] args){
        KotakSurat ks = new KotakSurat();
        TukangPos tp = new TukangPos(ks);
        TuanRumah tr = new TuanRumah(ks);
        
        new ThreadTukangPos(tp).start();
        new ThreadTuanRumah(tr).start();
    }
}    

    


