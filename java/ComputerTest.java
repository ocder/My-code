public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setName("ThinkPad");
        System.out.println(computer.getName());
        Desktop D1 = new Desktop();
        D1.setName("TP");
        System.out.println(D1.getName());
    }
}

class Computer {
    public String name;
    public int coreNumber;
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}

class Desktop extends Computer {
    void setName(String Name) {
        name = "D"+Name;
    }
    String getName() {
        return name+"D";
    }
}

