public class MainPercobaan1_1841720065Rifqie {
    public static void main(String[] args) {
    Processor1841720065Rifqie p = new Processor1841720065Rifqie("Intel Core i5-8250U", 4);
    Laptop1841720065Rifqie L = new Laptop1841720065Rifqie("Lenovo ThinkPad ", new Processor1841720065Rifqie("Intel i5", 3));
    L.info1841720065Rifqie();
    
    Processor1841720065Rifqie p1 = new Processor1841720065Rifqie();
    p1.setMerk1841720065Rifqie("Intel Core i7-8550U");
    p1.setCache1841720065Rifqie(6);
    Laptop1841720065Rifqie L1 = new Laptop1841720065Rifqie();
    L1.setMerk1841720065Rifqie("Lenovo Thinkpad ");
    L1.setProc1841720065Rifqie(p1);
    L1.info1841720065Rifqie();
}
}