package Practice.src.c20250417.hard.ch10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }

    private static void animalSound(Animal animal) {
        animal.sound();
    }
}
