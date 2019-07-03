package template;

import com.sun.tools.corba.se.idl.PragmaEntry;

public class TemplatePatterDemo {
    public static void main(String[] args) {
        Game game=new Cricket();
        game.play();

        Game game1=new FootBall();
        game1.play();
    }
}
