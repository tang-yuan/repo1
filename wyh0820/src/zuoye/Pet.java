package zuoye;

public class Pet implements Dog,Penguin {
    @Override
    public void show() {

    }
    public void show(Pet pet) {
        System.out.println("主人和"+pet+"玩接飞盘游戏，" +
                pet+"健康值减少10，与主人亲密度增加5");
    }
}
