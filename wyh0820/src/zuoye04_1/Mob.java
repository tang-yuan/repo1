package zuoye04_1;

public class Mob implements Phones{
    @Override
    public void show1() {
        System.out.println("这是一款型号为索尼爱立信的G502c手机");
        System.out.println("开始播放音乐《热雪》。。。");
        System.out.println("发送文字信息。。。");
        System.out.println("开始语音发送。。。");
    }

    @Override
    public void show2() {
        System.out.println("这是一款型号为HTC的I9100手机");
        System.out.println("已启动移动网络。。。");
        System.out.println("开始播放视频。。。");
        System.out.println("咔嚓。。。拍照成功");
        System.out.println("视频。。。");
    }
}
