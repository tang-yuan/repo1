package zuoye01;

public class Penguin implements Pet{
    final int id=321;
    @Override
    public void show() {
        System.out.println("主人和狗狗玩接飞盘游戏，狗狗健康值减少10，与主人亲密度增加5");
    }
}
