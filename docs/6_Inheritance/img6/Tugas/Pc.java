/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetugas;
public class Pc extends Komputer{
    protected int ukuranMonitor;
    public Pc(){
    
    }
    
    public Pc(String merk, int sizeMemory,int kecProsesor, String jnsProsesor,String jnsBaterai,int ukuranMonitor){
        this.merk=merk;
        this.jnsProsesor=jnsProsesor;
        this.sizeMemory=sizeMemory;
        this.kecProsesor=kecProsesor;
        this.ukuranMonitor=ukuranMonitor;
    }
    
    public void tampilPc(){
    System.out.println("Merk                    ="+merk);
    System.out.println("Jenis Prosesor          ="+jnsProsesor);
    System.out.println("Kecepatan Prosesor      ="+kecProsesor);
    System.out.println("Size Memory             ="+sizeMemory);
    System.out.println("Ukuran Monitor          ="+ukuranMonitor);
    }
}
