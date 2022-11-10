package Animal;

public class Cat extends Animal implements Actions {

   public Cat(String name, Integer age) {
        super(name, age);

    }

    @Override
    public void speak() {
        System.out.println(this.name + " говорит: Мяу-мяу ");
    }

    @Override
    public void move() {

        System.out.println(this.name + " отзывается и идет к человеку ");
    }

    @Override
    public void runAway() {
        System.out.println(this.name + " убегает прочь");
    }

}