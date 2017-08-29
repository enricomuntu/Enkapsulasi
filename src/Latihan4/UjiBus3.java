/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Enrico Ursidae
 */
public class UjiBus3 
{
    public static void main(String[] arg)
    {
    UjiBus3 Bus = new UjiBus3(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        
        Bus.addpenumpang (2);
        Bus.cetakpenumpang();
        
        Bus.addpenumpang (1);
        Bus.cetakpenumpang();
        
        Bus.addpenumpang (2);
        Bus.cetakepenumpang();
        
        Bus.addpenumpang (2);
        Bus.cetakpenumpang();
    }
}
