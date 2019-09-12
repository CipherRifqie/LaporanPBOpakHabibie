public class SepedaGunung1841720065Rifqie extends Sepeda1841720065Rifqie
{
    private String tipeSuspensi;
    
    public void setTipeSuspensi (String newValue)
    {
        tipeSuspensi = newValue;
    }
    
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("Tipe suspensi : " +tipeSuspensi);
    }
}