package visitor.EXP1;

//Define an interface to represent element.

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
