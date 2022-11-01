package Animal;

public interface Actions {

    void speak();

    void move();

    default void runAway() {
        System.out.println(" убегает прочь ");

    };
}
