 package Array;

public class ArrayEmp {
    public static void main(String[] args) {

        ArraysMain e1 = new ArraysMain(11,"ram");
        ArraysMain e2 = new ArraysMain(22,"krish");
        ArraysMain e3 = new ArraysMain(33, "radha");

        ArraysMain[] emp = new ArraysMain[3];
        emp[0] = e1;
        emp[1] = e2;
        emp[2] = e3;

        for(ArraysMain ee : emp){
            System.out.println(ee.eid + ee.ename);
        }
    }
}