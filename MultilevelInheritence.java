package Day4_Tasks;
// Multi-level Inheritence
class A1{
    void f1() {
        System.out.println("Grand Father Class");
    }
}

class B1 extends A1{
    void f2() {
        System.out.println("Father Class");
    }
}

class C1  extends B1{
    void f3() {
        System.out.println("Child Class");
    }
}

public class MultilevelInheritence {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.f1();
        obj.f2();
        obj.f3();
    }
}
