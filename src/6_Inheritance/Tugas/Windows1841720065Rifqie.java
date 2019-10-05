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
public class Windows1841720065Rifqie extends Laptop1841720065Rifqie{
    protected String mfitur;
    
    public Windows1841720065Rifqie(){
    
    }
    
    public Windows1841720065Rifqie(String mMerk, int mkecProsesor, int msizeMemory,String mjnsProsesor,String mjnsBaterai,String mfitur){
        this.mMerk=mMerk;
        this.mjnsProsesor=mjnsProsesor;
        this.mjnsBaterai=mjnsBaterai;
        this.msizeMemory=msizeMemory;
        this.mkecProsesor=mkecProsesor;
        this.mfitur=mfitur;
    }
    
    public void tampilWindows1841720065Rifqie(){
    System.out.println("Merk                    ="+mMerk);
    System.out.println("Jenis Prosesor          ="+mjnsProsesor);
    System.out.println("Jenis Baterai           ="+mjnsBaterai);
    System.out.println("Size Memory             ="+msizeMemory);
    System.out.println("Size Memory             ="+mkecProsesor);
    System.out.println("Fitur                   ="+mfitur);
    }
}
