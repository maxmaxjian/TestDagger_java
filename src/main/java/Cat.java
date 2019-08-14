import javax.inject.Inject;

public class Cat implements Animal {

    @Inject
    public Cat() {}

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " meow meow!");
    }
}
