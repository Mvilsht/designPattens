package composite.compositeRL1;

//Leaf
//represents leaf objects in the composition. A leaf has no children.
//defines behavior for primitive objects in the composition.

public class DepositAccount extends Component
{
    private String accountNo;
    private float accountBalance;

    private AccountStatement currentStmt;

    public DepositAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public float getBalance() {
        return accountBalance;
    }

    public AccountStatement getStatement() {
        return currentStmt;
    }
}