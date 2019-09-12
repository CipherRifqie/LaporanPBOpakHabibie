public class KipasAnginDinding1841720065Rifqie extends KipasAngin1841720065Rifqie
{
    private int harga;
    
    public void Price(int newValue){
       harga = newValue;
   }
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("Harga (dalam Rupiah) : " +harga);
    }
}