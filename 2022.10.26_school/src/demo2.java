/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-26
 * Time: 19:28
 */
class MeetEnemyState implements DogState {

    @Override
    public void showState() {
        System.out.println("对着敌人叫");
    }
}
class SoftlyState implements DogState {

    @Override
    public void showState() {
        System.out.println("友好状态");

    }
}
class MeetFriendState implements DogState {

    @Override
    public void showState() {
        System.out.println("开心的摇尾巴");
    }
}
class Dog {
    DogState state;
    public void cry() {
        state.showState();
    }
    public void setState(DogState s) {
        this.state = s;
    }
}
public class demo2 {
    public static void main(String[] args) {
        Dog yellowDog = new Dog();
        yellowDog.setState(new SoftlyState());
        yellowDog.cry();
        yellowDog.setState(new MeetEnemyState());
        yellowDog.cry();
        yellowDog.setState(new MeetFriendState());
        yellowDog.cry();

    }
}
