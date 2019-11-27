package _01;

public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Monitor monitor);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);
}
