package template;

public class FootBall extends Game {
    @Override
    void initialize() {
        System.out.println(" FootBall Game initialized ! please start game");
    }

    @Override
    void startPlay() {
        System.out.println(" FootBall Game started ! please enjoy game");
    }

    @Override
    void endPlay() {
        System.out.println(" FootBall Game finished !");
    }
}
