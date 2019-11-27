package zuoye06;

public class AptitudeHandset extends Handset implements Network,PlayWiring,TheakPictures {
    @Override
    public void networkConn() {
        System.out.println("连接网络");
    }

    @Override
    public void play(String content) {
        System.out.println("播放"+content);
    }

    @Override
    public void takePictures() {
        System.out.println("可以照相");
    }
}
