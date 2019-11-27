package zuoye02;

public class CalR {

    public int Rent(Vehicle[] vehicles,int s){
        int tota=0;
        for (int i = 0; i < vehicles.length; i++) {
            tota+=vehicles[i].calRent(s);
        }
        return tota;
    }
}
