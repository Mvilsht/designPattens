package decorator.decoratorRL1;

//Component – this is the wrapper which can have additional responsibilities associated with it at runtime.

public interface Report {
    public Object[][] getReportData(final String reportId);
    public String getFirstColumnData();
}
