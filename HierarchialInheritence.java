package Day4_Tasks;

class A2{
    void func1() {
        System.out.println("Parent : Class A2");
    }
}

class B2 extends A2{
    void func2() {
        System.out.println("Child : Class B2");
    }
}

class C2 extends A2{
    void func3() {
        System.out.println("Child : Class C2");
    }
}

public class HierarchialInheritence {
    public static void main(String[] args) {
        B2 obj1 = new B2();
        C2 obj2 = new C2();

        obj1.func1();
        obj1.func2();

        obj2.func1();
        obj2.func3();
    }
}
