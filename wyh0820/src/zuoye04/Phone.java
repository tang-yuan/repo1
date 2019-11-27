package zuoye04;

public class Phone extends Work implements Gongn01,Gongn02{
    private String name;
    private String type;

    public Phone() {
    }

    public Phone(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void show1() {
        System.out.println("开始播放音乐《热雪》。。。");
        System.out.println("发送文字信息。。。");
        System.out.println("开始语音发送。。。");
    }

    @Override
    public void show2() {
        System.out.println("已启动移动网络。。。");
        System.out.println("开始播放视频。。。");
        System.out.println("咔嚓。。。拍照成功");
        System.out.println("视频。。。");
    }
}
