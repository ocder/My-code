public class TestToString {
    public static void main(String[] args) {
        //Cat类并未将toString方法覆盖
        Cat cat = new Cat(1);
        System.out.println(cat.toString());
        System.out.println(cat); 

        Dog dog = new Dog(1);
        System.out.println(dog.toString());
        /*
        将某个对象用于和字符串相加或是用做方法System.out.println()的参数时，
        系统会自动调用toString()方法将其转成字符串，类Dog将toString覆盖了
        */
        System.out.println(dog);
        System.out.println("Dog No. "+dog);
    }
}

class Cat {
    private int catNo;

    Cat(int n) {
        catNo = n;
    }
}

class Dog {
    private int dogNo;

    Dog(int n) {
        dogNo = n;
    }

    public String toString() {
        return("" + dogNo);
    }
}