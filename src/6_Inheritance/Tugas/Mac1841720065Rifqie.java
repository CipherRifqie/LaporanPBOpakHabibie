/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetugas;

public class Mac1841720065Rifqie extends Laptop1841720065Rifqie{
    protected String msecurity;
    
    public Mac1841720065Rifqie(){
    
    }
    
    public Mac1841720065Rifqie(String mMerk, int msizeMemory,String mjnsProsesor,String mjnsBaterai,String msecurity){
        this.mMerk=mMerk;
        this.mjnsProsesor=mjnsProsesor;
        this.msizeMemory=msizeMemory;
        this.msecurity=msecurity;
    }
    
    public void tampilMac1841720065Rifqie(){
    System.out.println("Merk                    ="+mMerk);
    System.out.println("Jenis Prosesor          ="+mjnsProsesor);
    System.out.println("Size Memory             ="+msizeMemory);
    System.out.println("Security                ="+msecurity);
    }
    
}
