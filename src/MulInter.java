interface Car {
    void fourSeat();
}
interface Bike{
    void twoSeat();
}
class Test implements Car , Bike{
    @Override
    public void fourSeat() {
        System.out.println("Car has 4seats");
    }

    @Override
    public void twoSeat() {
        System.out.println("Bike has 2seats");
    }
}


public class MulInter {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.fourSeat();
        obj.twoSeat();

        //new Test().fourSeat();
        //new Test().twoSeat();
    }
}
