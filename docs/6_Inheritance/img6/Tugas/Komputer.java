
package inheritancetugas;
public class Komputer {
    protected String merk,jnsProsesor;
    protected int kecProsesor,sizeMemory;
    
    public Komputer(){
    
    }
    
    public Komputer(String merk, int kecProsesor, int sizeMemory,String jnsProsesor){
        this.merk=merk;
        this.jnsProsesor=jnsProsesor;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
    }
    
    public void tampilData(){
    System.out.println("Merek                    ="+merk);
    System.out.println("Jenis Prosesor          ="+jnsProsesor);
    System.out.println("Keceptan Prosesor       ="+kecProsesor);
    System.out.println("Size Memory             ="+sizeMemory);
    }
}
