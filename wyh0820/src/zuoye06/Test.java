package zuoye06;

public class Test {
    public static void main(String[] args) {
        Handset handset=new CommonHandset();
        handset.brand="苹果";
        handset.type="5s";
        handset.show();
        handset.call();
        handset.Info();
        handset.sendInfo();

        AptitudeHandset a=new AptitudeHandset();
        a.brand="华为";
        a.type="p30";
        a.show();
        a.networkConn();
        a.play("<月亮代表我的心>");
        a.takePictures();
        a.call();
        a.Info();
        a.sendInfo();

    }
}
