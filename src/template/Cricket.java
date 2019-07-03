package template;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game initialized! started game!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started ! please enjoy game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game finished! ");
    }
}
