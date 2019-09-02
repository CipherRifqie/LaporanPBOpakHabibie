public class KipasAnginLantai extends KipasAngin
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