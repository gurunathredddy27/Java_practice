
interface Vehicle{  //interface only store the methods and make them abstract and public and final(variables)
                        // but it will not implements them
    void car();
    void bike();
}
class B implements Vehicle{ // we have to create another class and make them abstract
                        // by implementing the methods in interface
    @Override
    public void car() {
        System.out.println("car");
    }

    @Override
    public void bike() {
        System.out.println("bike");
    }
}


public class Inter {
    public static void main(String[] args) {
        B obj = new B();
        obj.bike();
        obj.car();
    }
}
