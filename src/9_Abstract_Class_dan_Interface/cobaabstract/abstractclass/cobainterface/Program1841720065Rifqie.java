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
public class Program1841720065Rifqie {
    public static void main(String[] args) {
        Rektor1841720065Rifqie pakRektor = new Rektor1841720065Rifqie();
        
        Mahasiswa1841720065Rifqie mahasiswaBiasa = new Mahasiswa1841720065Rifqie("Charlie");
        Sarjana1841720065Rifqie sarjanaCumlaude = new Sarjana1841720065Rifqie("Dini");
        PascaSarjana1841720065Rifqie masterCumlaude = new PascaSarjana1841720065Rifqie("Elok");
        
        //pakRektor.beriSertifikatCunlaude(mahasiswaBiasa);
        pakRektor.beriSertifikatCunlaude1841720065Rifqie(sarjanaCumlaude);
        pakRektor.beriSertifikatCunlaude1841720065Rifqie(masterCumlaude);
        
        
        System.out.println("-----------------------------------------------");
        
        pakRektor.beriSertifikatMawapres1841720065Rifqie(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres1841720065Rifqie(masterCumlaude);
        
    }
}
