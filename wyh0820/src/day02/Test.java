package day02;

public class Test {
    public static void main(String[] args) {
          MotoVechile  motoVechile[]=new  MotoVechile[4];
          motoVechile[0]=new  Car("宝马","京A3256");
          motoVechile[1]=new  Car("别克","京A345");
          motoVechile[2]=new  Car("别克","京A345");
          motoVechile[3]=new  Bus("大巴","京32645");

       Money  m=new Money();
        int i = m.roleCount(motoVechile, 40);
        System.out.println(i);

    }
}
