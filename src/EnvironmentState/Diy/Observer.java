package EnvironmentState.Diy;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
