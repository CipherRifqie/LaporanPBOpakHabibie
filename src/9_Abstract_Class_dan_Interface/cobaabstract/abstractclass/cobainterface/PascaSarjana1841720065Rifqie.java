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
public class PascaSarjana1841720065Rifqie extends Mahasiswa1841720065Rifqie implements  ICumlaude1841720065Rifqie, IBerprestasi1841720065Rifqie{
    
    public PascaSarjana1841720065Rifqie(String Mnama){
        super(Mnama);
    }
    //CUMLAUDE-------------------------------------------------------------------------------------------------------------------------
    @Override
    public void lulus1841720065Rifqie() {
        System.out.println("Aku sudah menyelesaikann tesis");
    }

    @Override
    public void meraihIPKTinggi1841720065Rifqie() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
    
     @Override
    public void kuliahDiKampus1841720065Rifqie() {
        //System.out.println(" "+ super.kuliahDiKampus());
        super.kuliahDiKampus1841720065Rifqie();
    }
    
    //BERPRESTASI-----------------------------------------------------------------------------------------------------------------------
    @Override
    public void menjuaraiKompetisi1841720065Rifqie() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah1841720065Rifqie() {
        System.out.println("Saya menerbitkan artikel di jurnal Internasional");
    }
}
