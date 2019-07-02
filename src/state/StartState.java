package state;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("player in a start state");
        context.setState(this);
    }
}
