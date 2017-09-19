package Duck;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
