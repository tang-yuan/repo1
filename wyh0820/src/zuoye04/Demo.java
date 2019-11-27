package zuoye04;

public class Demo {
    public Phone show05(Work[] work){
        Phone phone=null;
        for (int i = 0; i < work.length; i++) {
            phone=(Phone) work[i];
        }
        return phone;
    }
}
