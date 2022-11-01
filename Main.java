package Animal;

public class Main {
    public static void main(String args[]) {

        Person person = new Person("Олег");
        person.speak();

        Cat cat = new Cat("Пушок");
        cat.speak();

        Dog dog = new Dog("Тузик");
        dog.speak();

        cat.move();
        dog.move();

        person.speakLoud();
        cat.runAway();
        dog.runAway();

    }

}
