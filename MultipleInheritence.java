package Day4_Tasks;

interface A3 {
    void func1();
}

interface B3 {
    void func2();
}

class C3 implements A3, B3 {
    @Override
    public void func1() {
        System.out.println("Interface A3 Func1() : Inside C3 Class");
    }

    @Override
    public void func2() {
        System.out.println("Interface B3 Func2() : Inside C3 Class");
    }
}

public class MultipleInheritence {
    public static void main(String[] args) {
        C3 obj = new C3();
        obj.func1();
        obj.func2();
    }
}
