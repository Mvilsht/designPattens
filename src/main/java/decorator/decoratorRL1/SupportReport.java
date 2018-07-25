package decorator.decoratorRL1;

//Concrete component– is the original object to which the additional responsibilities are added in program.

public class SupportReport implements Report {

    @Override
    public Object[][] getReportData(String reportId) {
        return null;
    }

    @Override
    public String getFirstColumnData() {
        return "Support data";
    }

}
