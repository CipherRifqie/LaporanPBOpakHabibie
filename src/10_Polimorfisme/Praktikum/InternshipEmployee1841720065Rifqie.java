public class InternshipEmployee1841720065Rifqie extends Employee1841720065Rifqie{
    private int Mlength;

    public InternshipEmployee1841720065Rifqie(String Mname, int Mlength) {
        this.Mlength = Mlength;
        this.Mname = Mname; 
    }

    public int getLength1841720065Rifqie() {
        return Mlength;
    }

    public void setLength1841720065Rifqie(int Mlength) {
        this.Mlength = Mlength;
    }
    @Override
    public String getEmployeeInfo1841720065Rifqie(){
        String info = super.getEmployeeInfo1841720065Rifqie()+"\n";
        info += "Registered as Internship Employees for "+Mlength +" month/s\n";
        return info;
    }
}