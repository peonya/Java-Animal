package Animal;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String args[]) {

        Person person = new Person("Олег");
        person.speak();

        ArrayList<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("Муся", 1);
        Cat cat2 = new Cat("Пуся", 2);
        Cat cat3 = new Cat("Дуся", 3);

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        // Cat cat = new Cat("Пушок", 2);
        cat1.speak();
        cat2.speak();
        cat3.speak();

        Dog dog = new Dog("Тузик", 3);
        dog.speak();

        cat1.move();
        cat2.move();
        cat3.move();
        dog.move();

        person.speakLoud();
        cat1.runAway();
        cat2.runAway();
        cat3.runAway();
        dog.runAway();

        Iterator<Cat> iterator = cats.iterator(); // удаляем все элементы списка
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(cats);

        System.out.println(cat1.compareTo(dog)); // сравниваем возраст животных

    }

}