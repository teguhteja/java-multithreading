/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttm.threading;

/**
 *
 * @author teguhteja
 */
public class DoubleThreading {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Baris Pertama");
        System.out.println("Baris Kedua");
        new Thread(new Runnable(){
            public void run(){
                System.out.println("Baris Ketiga");
                System.out.println("Baris Keempat");
                System.out.println("Baris Kelima");
            }
        }).start();
        System.out.println("Baris Keenam");
        System.out.println("Baris Ketujuh");
        System.out.println("Baris Kedelapan");
    }
}
