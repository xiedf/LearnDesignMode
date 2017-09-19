package Duck;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("Model Duck");
    }
}
