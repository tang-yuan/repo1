package zuoye06;

public class CommonHandset extends Handset implements PlayWiring {
    @Override
    public void play(String content) {
        System.out.println("播放");
    }
}
