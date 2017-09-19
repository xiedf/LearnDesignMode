package Duck;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new MuteQuack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
