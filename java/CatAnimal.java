public class CatAnimal extends Animal {
    public static void main(String[] args) {
        CatAnimal cat = new CatAnimal();
        cat.setAge(2);
        cat.setWeight(5);
        System.out.println("CAT");
        cat.meow();
        System.out.println("Age=" + cat.getAge() + "\t\tWeight=" 
        + cat.getWeight());
    }

    void meow() {
        System.out.println("Meow...");
    }
}

class Animal {
    private int weight;
    private int age;

    int getAge() {
        return age;
    }

    int getWeight() {
        return weight;
    }
    
    //this将局部变量age的值传递给成员变量
    void setAge(int age) {
        this.age = ((age>=0)?age:0);
    }

    void setWeight(int weight) {
        this.weight = ((weight>=0)?weight:0);
    }
}