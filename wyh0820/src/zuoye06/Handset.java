package zuoye06;

public class Handset {
    String brand;
    String type;

    public void show(){
        System.out.println("手机是:"+brand+"型号是："+type);
    }
    public void sendInfo(){
        System.out.println("播放音频");
    }
    public void call(){
        System.out.println("打电话");
    }
    public void Info(){
        System.out.println("发信息");
    }
}
