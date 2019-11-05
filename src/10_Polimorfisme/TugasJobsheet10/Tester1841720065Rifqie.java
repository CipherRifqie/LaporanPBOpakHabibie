package TugasJobsheet10;
public class Tester1841720065Rifqie{
    public static void main(String[] args) {
        WalkingZombie1841720065Rifqie wz = new WalkingZombie1841720065Rifqie(100, 1);
        JumpingZombie1841720065Rifqie jz = new JumpingZombie1841720065Rifqie(100, 2);
        Barrier1841720065Rifqie b = new Barrier1841720065Rifqie(100);
        Plantz1841720065Rifqie p = new Plantz1841720065Rifqie();
        System.out.println(""+wz.getZombieInfo1841720065Rifqie());
        System.out.println(""+jz.getZombieInfo1841720065Rifqie());
        System.out.println(""+b.getBarrierInfo1841720065Rifqie());
        System.out.println("-------------------");
        for(int i=0;i<4;i++){
            p.doDestroy1841720065Rifqie(wz);
            p.doDestroy1841720065Rifqie(jz);
            p.doDestroy1841720065Rifqie(b);
        }
        System.out.println(""+wz.getZombieInfo1841720065Rifqie());
        System.out.println(""+jz.getZombieInfo1841720065Rifqie());
        System.out.println(""+b.getBarrierInfo1841720065Rifqie());
    }
}
