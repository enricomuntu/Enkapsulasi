/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Enrico Ursidae
 */
public class UjiBus {
    public static void main (String[] args){
        int password;
        
        Bus busBesar = new Bus(20);
        busBesar.cetak();
        
        busBesar.getPenumpang(60);
        busBesar.cetak();
        
        busBesar.getPenumpang(55);
        busBesar.cetak();
        
        busBesar.getPenumpang(60);
        busBesar.cetak();
        
        System.out.println("Rata-rata Penumpang:"+busBesar.getAverage());
    }
}
