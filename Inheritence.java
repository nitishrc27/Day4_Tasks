package Day4_Tasks;

class P {
    int a = 10;
    int b = 20;

    void pSum () {
        System.out.println(a + b);
    }
}

class C extends P {
    int c = 100;
    int d = 200;
    void cMul() {
        System.out.println(c * d);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        C obj = new C();
        obj.pSum();
        obj.cMul();
    }
}
