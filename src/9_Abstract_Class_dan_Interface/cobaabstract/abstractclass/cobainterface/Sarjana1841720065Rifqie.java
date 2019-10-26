/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaabstract.abstractclass.cobainterface;

/**
 *
 * @author Dell
 */
public class Sarjana1841720065Rifqie extends Mahasiswa1841720065Rifqie implements ICumlaude1841720065Rifqie,IBerprestasi1841720065Rifqie{
    
    public Sarjana1841720065Rifqie(String Mnama){
        super(Mnama);    
    }
    //ICUMLAUDE----------------------------------------------------------------------
    @Override
    public void lulus1841720065Rifqie() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi1841720065Rifqie() {
        System.out.println("IPS-ku lebih dari 3,51");
    }
    
    @Override
    public void kuliahDiKampus1841720065Rifqie() {
        super.kuliahDiKampus1841720065Rifqie();
    }
    
    //IBerprestasi------------------------------------------------------------------------
    @Override
    public void menjuaraiKompetisi1841720065Rifqie() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah1841720065Rifqie() {
        System.out.println("Saya menerbitkan artikel di jurnal Internasional");
    }
    
}
