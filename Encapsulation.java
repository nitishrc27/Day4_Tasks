package Day4_Tasks;

class Example {
    private String name = "";
    private int  age = 0;

    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.setAge(18);
        obj.setName("ABC");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
