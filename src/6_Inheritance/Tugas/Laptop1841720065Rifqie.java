/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetugas;

/**
 *
 * @author Dell
 */
public class Laptop1841720065Rifqie extends Komputer1841720065Rifqie{
    protected String mjnsBaterai;
    
    public Laptop1841720065Rifqie(){
    
    }
    
    public Laptop1841720065Rifqie(String mMerk, int msizeMemory,String mjnsProsesor,String mjnsBaterai){
        this.mMerk=mMerk;
        this.mjnsProsesor=mjnsProsesor;
        this.mjnsBaterai=mjnsBaterai;
        this.msizeMemory=msizeMemory;
    }
    
    public void tampilLaptop1841720065Rifqie(){
    System.out.println("Merk                    ="+mMerk);
    System.out.println("Jenis Prosesor          ="+mjnsProsesor);
    System.out.println("Jenis Baterai           ="+mjnsBaterai);
    System.out.println("Size Memory             ="+msizeMemory);
    }
}
