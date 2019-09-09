public class DiscountedPackage1841720065Rifqie {
    public int code;
    public String nameofPackage;
    public int basicPrice;
    public float discount;
    
    public float afterDiscountedPackageRifqie(){
       float afterDiscountedPackageRifqie = (basicPrice * discount);
       return afterDiscountedPackageRifqie;
    }
    public void tampilDataRifqie(){
        System.out.println("Kode Barang : " +code);
        System.out.println("Nama Barang : " +nameofPackage);
        System.out.println("Harga Dasar : " +basicPrice);
        System.out.println("Diskon : " +discount +("%"));
    }
}