package oldpackage.state;

public class StopState implements State {


    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop oldpackage.state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
