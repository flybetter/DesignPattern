package visitor;

import java.awt.event.MouseAdapter;

public interface ComputerPartVisitor {
    public void visit(Keyboard keyboard);
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Monitor monitor);

}
