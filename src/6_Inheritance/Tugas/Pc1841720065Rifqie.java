/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetugas;
public class Pc1841720065Rifqie extends Komputer1841720065Rifqie{
    protected int mukuranMonitor;
    public Pc1841720065Rifqie(){
    
    }
    
    public Pc1841720065Rifqie(String mMerk, int msizeMemory,int mkecProsesor, String mjnsProsesor,String mjnsBaterai,int mukuranMonitor){
        this.mMerk=mMerk;
        this.mjnsProsesor=mjnsProsesor;
        this.msizeMemory=msizeMemory;
        this.mkecProsesor=mkecProsesor;
        this.mukuranMonitor=mukuranMonitor;
    }
    
    public void tampilPc1841720065Rifqie(){
    System.out.println("Merk                    ="+mMerk);
    System.out.println("Jenis Prosesor          ="+mjnsProsesor);
    System.out.println("Kecepatan Prosesor      ="+mkecProsesor);
    System.out.println("Size Memory             ="+msizeMemory);
    System.out.println("Ukuran Monitor          ="+mukuranMonitor);
    }
}
