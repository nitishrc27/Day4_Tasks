package Day4_Tasks;

//Abstract class should contain atleast one abstract method in it.
//Objects cannot be created for the abstract class.
abstract class Parent{
    abstract void func1();

    void func2(){
        System.out.println("Parent Class : func2");
    }
}

class Child extends Parent{
    void func1() {
        System.out.println("Child Class : func");
    }
}

public class Abstraction {
    public static void main(String[] args) {
//        Parent  p = new Parent();  ERROR - Cannot create object for the Abstract Class
        Parent obj = new Child();
        obj.func1();
    }
}
