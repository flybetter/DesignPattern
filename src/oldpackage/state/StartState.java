package oldpackage.state;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("player in a start oldpackage.state");
        context.setState(this);
    }
}
