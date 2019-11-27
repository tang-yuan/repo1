package zuoye05;

public class Conputer implements Cpu,Neicun,Yinpan {
    String type;
    String ZT;
    String YRL;
    String NRL;


    @Override
    public void show1() {
        System.out.println("CPU的品牌是："+type+"主题是:"+ZT);
    }

    @Override
    public void show3() {
        System.out.println("硬盘容量是："+YRL);
    }

    @Override
    public void show2() {
        System.out.println("内存容量是："+NRL);
    }
}
