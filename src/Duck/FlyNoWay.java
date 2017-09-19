package Duck;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("cant fly");
    }
}
