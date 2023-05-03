package Array;

public class ArrayException { //Null pointer exception
    public static void main(String[] args) {
        ArraysMain e1 = new ArraysMain(11,"ram");
        ArraysMain e2 = new ArraysMain(22,"krish");
        ArraysMain e3 = new ArraysMain(33, "radha");

        ArraysMain[] emp = new ArraysMain[5];
        emp[0] = e1;
        emp[2] = e2;
        emp[4] = e3;

        for( Object o : emp){
            if(o instanceof ArraysMain){
                ArraysMain ee = (ArraysMain) o;
                System.out.println(ee.eid + ee.ename);
            }
            if(o == null){
                System.out.println(o);
            }
        }
    }
}
