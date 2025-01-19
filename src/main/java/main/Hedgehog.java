package main;

public class Hedgehog {
    String name;
    int age;

    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(String message) {
        if (message.isEmpty()) {
            System.out
                    .println("I am " + name + " and my age is " + age + ", but could you still give me input values?");
        } else {
            System.out.println(name + ": " + message);
        }
    }

    public void run(int laps) {
        for (int i = 0; i < laps; i++) {
            System.out.println(name + " runs really fast!");
        }
    }
}
