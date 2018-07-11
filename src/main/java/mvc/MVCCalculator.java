package mvc;
//To understand the Model View Controller you just need to know that it separates the Calculations and Data from the interface.
// The Model is the class that contains the data and the methods needed to use the data. The View is the interface.
// The Controller coordinates interactions between the Model and View.

public class MVCCalculator {

    public static void main(String[] args) {

        CalculatorView theView = new CalculatorView();

        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theView,theModel);

        theView.setVisible(true);

    }
}
