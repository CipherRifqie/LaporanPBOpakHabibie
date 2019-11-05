public class Tester41841720065Rifqie {
    public static void main(String[] args) {
        Owner1841720065Rifqie ow = new Owner1841720065Rifqie();
        ElectricityBill1841720065Rifqie eBill = new ElectricityBill1841720065Rifqie(5, "R-34");
        ow.pay1841720065Rifqie(eBill); //pay for an electricity bill
        System.out.println("---------------------");
        
        PermanentEmployee1841720065Rifqie pEmp = new PermanentEmployee1841720065Rifqie("Dolph Ziggler", 500);
        ow.pay1841720065Rifqie(pEmp); //pay for permanent employee
        System.out.println("---------------------");
        
        InternshipEmployee1841720065Rifqie iEmp = new InternshipEmployee1841720065Rifqie("Seth Rollins", 5);
        ow.showMyEmployee1841720065Rifqie(pEmp); //showing for permanent employee
        System.out.println("---------------------");
        ow.showMyEmployee1841720065Rifqie(iEmp); //showing all of your data;
    }
}
