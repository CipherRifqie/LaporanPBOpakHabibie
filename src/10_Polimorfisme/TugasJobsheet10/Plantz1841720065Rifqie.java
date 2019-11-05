package TugasJobsheet10;
public class Plantz1841720065Rifqie{
    public void doDestroy1841720065Rifqie(Destroyable1841720065Rifqie d){
        if(d instanceof JumpingZombie1841720065Rifqie){
            ((JumpingZombie1841720065Rifqie) d).heal1841720065Rifqie();
            d.destroyed1841720065Rifqie();
        }
        else if(d instanceof WalkingZombie1841720065Rifqie){
            ((WalkingZombie1841720065Rifqie) d).heal1841720065Rifqie();
            d.destroyed1841720065Rifqie();
        }
    }
}
