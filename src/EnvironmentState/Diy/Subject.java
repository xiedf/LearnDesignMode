package EnvironmentState.Diy;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();

}
