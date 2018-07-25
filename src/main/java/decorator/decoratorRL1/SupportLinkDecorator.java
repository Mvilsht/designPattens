package decorator.decoratorRL1;

//Concrete decorator-they extend the decorator and builds additional functionality on top of the Component class.

public class SupportLinkDecorator extends ColumDecorator{

    public SupportLinkDecorator(Report report) {
        super(report);
    }

    public String getFirstColumnData() {
        return addMoreInfo (super.getFirstColumnData()) ;
    }

    private String addMoreInfo(String data){
        return data  + " - support link - ";
    }
}
