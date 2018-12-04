public class Cat extends Animal {
    public static void main(String[] args) {
        //子类自动获取父类所有成员，但不能获得构造方法
        Cat cat = new Cat();
        cat.setAge(2);
        System.out.println(cat.getAge());
    }
}

class Animal {
    //子类不可以访问父类的私有成员
    private int weight;
    private int age;

    int getAge() {
        return age;
    }

    int getWeight() {
        return weight;
    }

    void setAge(int age) {
        this.age = ((age > 0)? age : 0);
    }

    void setWeight(int weight) {
        this.weight = ((weight >= 0)? weight : 0);
    }
}