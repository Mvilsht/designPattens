package visitor.EXP1;

//Use the ComputerPartDisplayVisitor to display parts of Computer.

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
