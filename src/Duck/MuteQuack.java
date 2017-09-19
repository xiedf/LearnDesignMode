package Duck;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
