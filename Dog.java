package Animal;

public class Dog extends Animal implements Actions {

    public Dog(String name) {
        super(name);

    }

    @Override
    public void speak() {
        System.out.println(this.name + " говорит: Гав-гав");
    }

    @Override
    public void move() {

        System.out.println(this.name + " махает хвостом ");
    }

    @Override
    public void runAway() {
        System.out.println(this.name + " убегает прочь");
    }

}
