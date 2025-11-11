package Day4_Tasks;

// Since Java8 Interfaces can contain Static Methods & Default Methods as well.
interface Examp {
    //public, static, final
    final int num = 10;

    void printMsg();  // Abstract Method
}

class Child1 implements Examp {
    public void printMsg() {
        System.out.println("Implemented in Child Class : Hello");
    }
}

public class InterfacesAbstraction {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.printMsg();
        System.out.println(obj.num);
    }
}
