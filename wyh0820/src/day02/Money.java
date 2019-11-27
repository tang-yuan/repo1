package day02;

public class Money {

    public   int  roleCount(MotoVechile [] motoVechiles,int s){
         int   index=0;
        for (int i = 0; i <motoVechiles.length ; i++) {

               index+=motoVechiles[i].calRent(s);

        }
        return  index;
    }
}
