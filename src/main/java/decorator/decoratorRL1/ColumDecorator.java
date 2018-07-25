package decorator.decoratorRL1;

//Decorator-this is an abstract class which contains a reference to the component object and also implements the component interface.

public abstract class ColumDecorator implements Report
{
    private Report decoratedReport;

    public ColumDecorator(Report report){
        this.decoratedReport = report;
    }

    public String getFirstColumnData() {
        return decoratedReport.getFirstColumnData();
    }

    @Override
    public Object[][] getReportData(String reportId) {
        return decoratedReport.getReportData(reportId);
    }
}
