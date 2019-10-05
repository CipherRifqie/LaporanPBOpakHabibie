
package inheritancetugas;
public class Komputer1841720065Rifqie {
    protected String mMerk,mjnsProsesor;
    protected int mkecProsesor,msizeMemory;
    
    public Komputer1841720065Rifqie(){
    
    }
    
    public Komputer1841720065Rifqie(String mMerk, int mkecProsesor, int msizeMemory,String mjnsProsesor){
        this.mMerk=mMerk;
        this.mjnsProsesor=mjnsProsesor;
        this.mkecProsesor=mkecProsesor;
        this.msizeMemory=msizeMemory;
    }
    
    public void tampilData1841720065Rifqie(){
    System.out.println("Merek                    ="+mMerk);
    System.out.println("Jenis Prosesor          ="+mjnsProsesor);
    System.out.println("Keceptan Prosesor       ="+mkecProsesor);
    System.out.println("Size Memory             ="+msizeMemory);
    }
}
