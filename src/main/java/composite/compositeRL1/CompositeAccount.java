package composite.compositeRL1;

//Composite
//defines behavior for components having children.
//stores child components.
//implements child-related operations in the Component interface.

public class CompositeAccount extends Component
{
    private float totalBalance;
    private AccountStatement compositeStmt, individualStmt;

    public float getBalance() {
        totalBalance = 0;
        for (Component f : list) {
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }

    public AccountStatement getStatement() {
        for (Component f : list) {
            individualStmt = f.getStatement();
            compositeStmt.merge(individualStmt);
        }

        return compositeStmt;
    }
}
