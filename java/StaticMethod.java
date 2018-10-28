/*
    *静态变量属于整个类
*/

public class StaticMethod {
    public static void main(String[] args) {
        Cat c = Cat.birthCat();
        Cat.getCat().age = 1;
        System.out.println("CAT1 age=" + c.age);
        System.out.println("CAT2 age=" + Cat.getCat().age);
    }
}

class Cat {
    static Cat c = new Cat();
    int age = 0;

    static Cat birthCat() {
        return new Cat();
    }

    static Cat getCat() {
        return c;
    }
}