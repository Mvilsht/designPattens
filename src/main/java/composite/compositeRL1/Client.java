package composite.compositeRL1;

//final notes
//The composite pattern defines class hierarchies consisting of individual objects and composite objects.
//Clients treat primitive and composite objects uniformly through a component interface which makes client code simple.
//Adding new components can be easy and client code does not need to be changed since client deals with the new components through the component interface.
//Composite hierarchy can be traversed with Iterator design pattern.
//Visitor design pattern can apply an operation over a Composite.
//Flyweight design pattern is often combined with Composite to implement shared leaf nodes.

//Client
//manipulates objects in the composition through the Component interface.

public class Client
{
    public static void main(String[] args)
    {
        // Creating a component tree
        Component component = new CompositeAccount();

        // Adding all accounts of a customer to component
        component.add(new DepositAccount("DA001", 100));
        component.add(new DepositAccount("DA002", 150));
        component.add(new SavingsAccount("SA001", 200));

        // getting composite balance for the customer
        float totalBalance = component.getBalance();
        System.out.println("Total Balance : " + totalBalance);

        AccountStatement mergedStatement = component.getStatement();
        //System.out.println("Merged Statement : " + mergedStatement);
    }
}