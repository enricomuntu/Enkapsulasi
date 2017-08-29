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
public class Bus {
    private double penumpang;
    private double maxPenumpang;
    private double penumpangBaru;
    private double counter;
    
    public Bus(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
            
        }else{
            this.penumpang = temp;
            counter++;
        }
    }
    public void getPenumpang(double password){
        if (password==123){
            System.out.println("Password benar");
            addPenumpang(15);
        }
        else{
            System.out.println("Password Salah");
        }
    }
    public double getAverage(){
        return penumpang/counter;
    }
    public void cetak(){
        System.out.println("Penumpang bus adalah = "+penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah = "+maxPenumpang);
    }
}
