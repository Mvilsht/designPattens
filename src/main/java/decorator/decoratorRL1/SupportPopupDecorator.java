package decorator.decoratorRL1;

//Concrete decorator-they extend the decorator and builds additional functionality on top of the Component class.

public class SupportPopupDecorator extends ColumDecorator{

    public SupportPopupDecorator(Report report) {
        super(report);
    }

    public String getFirstColumnData() {
        return addPopup (super.getFirstColumnData()) ;
    }

    private String addPopup(String data){
        return data  + " - support popup - ";
    }
}