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
public class Windows extends Laptop{
    protected String fitur;
    
    public Windows(){
    
    }
    
    public Windows(String merk, int kecProsesor, int sizeMemory,String jnsProsesor,String jnsBaterai,String fitur){
        this.merk=merk;
        this.jnsProsesor=jnsProsesor;
        this.jnsBaterai=jnsBaterai;
        this.sizeMemory=sizeMemory;
        this.kecProsesor=kecProsesor;
        this.fitur=fitur;
    }
    
    public void tampilWindows(){
    System.out.println("Merk                    ="+merk);
    System.out.println("Jenis Prosesor          ="+jnsProsesor);
    System.out.println("Jenis Baterai           ="+jnsBaterai);
    System.out.println("Size Memory             ="+sizeMemory);
    System.out.println("Size Memory             ="+kecProsesor);
    System.out.println("Fitur                   ="+fitur);
    }
}
