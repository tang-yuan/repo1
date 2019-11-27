package zuoye03;

public class TheftproofDoor extends Door implements DoorBell,Lock {

    @Override
    public void Odoor() {
        System.out.println("用力推，门打开了");
    }

    @Override
    public void Cdoor() {
        System.out.println("轻轻拉门，门关上了");
    }

    @Override
    public void Cshow() {
        System.out.println("插进钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙");
    }

    @Override
    public void Oshow() {
        System.out.println("插进钥匙，向右旋转钥匙三圈，锁打开了，拔出钥匙");
    }
    public void show(){
        System.out.println("铃。。。咔嚓。。。照片已储存");
    }
}
