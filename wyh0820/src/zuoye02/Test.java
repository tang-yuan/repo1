package zuoye02;

public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[4];
        vehicles[0]=new Car("宝马","京A6324");
        vehicles[1]=new Car("宝马","京A3215");
        vehicles[2]=new Car("宝马","京A3215");
        vehicles[3]=new Bus("大巴","京A1234");

        CalR c=new CalR();
        int i=c.Rent(vehicles,50);
        System.out.println(i);

    }
}
