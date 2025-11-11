package Day4_Tasks;

class p1 {
    //Method Overloading
    void print() {
        System.out.println("Hello");
    }

    void print(String name) {
        System.out.println(name);
    }

    void  print(String name, String greeting) {
        System.out.println("Parent Class : "+greeting+ " "+name);
    }
}

class c1 extends p1 {
    //Method Overriding
    @Override
    void print(String name, String greeting) {
        System.out.println("Child Class : "+greeting+ " "+name);
    }
}

// Method Overloading - Compile Time PolyMorphism
// Method Overriding  - RunTime PolyMorphism
public class PolyMorphism {
    public static void main(String[] args) {
        c1  obj = new c1();
        obj.print();
        obj.print("Nitish");
        obj.print("Hello", "Nitish");
    }
}
