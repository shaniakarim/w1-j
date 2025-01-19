package main;

public class Hedgehog {
    String name;
    int age;

    // Default constructor
    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    }

    // Constructor with parameters
    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Speak method
    public void speak(String message) {
        if (message.isEmpty()) {
            System.out
                    .println("I am " + name + " and my age is " + age + ", but could you still give me input values?");
        } else {
            System.out.println(name + ": " + message);
        }
    }

    // Run method
    public void run(int laps) {
        for (int i = 0; i < laps; i++) {
            System.out.println(name + " runs really fast!");
        }
    }
}
