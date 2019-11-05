package TugasJobsheet10;
import static java.awt.SystemColor.info;
import java.util.logging.Level;
public class WalkingZombie1841720065Rifqie extends Zombie1841720065Rifqie{
    
    public WalkingZombie1841720065Rifqie(int Mhealth, int Mlevel){
    super.Mlevel=Mlevel;
    super.Mhealth=Mhealth;
    }
    public void heal1841720065Rifqie(){
        switch (Mlevel) {
            case 1:
                System.out.println(Mhealth - 20);
                break;
            case 2:
                System.out.println(Mhealth - 30);
                break;
            case 3:
                System.out.println(Mhealth - 40);
                break;
            default:
                System.out.println("----------");
                break;
        }
    }
    public void destroyed1841720065Rifqie(){
        if(super.Mhealth == -2){
            System.out.println(Mhealth - 2);
        } else  {
            System.out.println();
        }
    }
    public String getZombieInfo1841720065Rifqie(){
        String info = super.getZombie1841720065Rifqie()+"\n";
        info += "Walking Zombie Data =" +"\n health ="+Mhealth+"\n Level ="+Mlevel;
        
        return info;
    }
}
