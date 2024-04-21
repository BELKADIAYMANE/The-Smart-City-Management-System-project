package User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReportCollection {
    private List<Report> reportList;

    public ReportCollection() {
        reportList = new ArrayList<>();
    }

    public void addReport(Report report) {
        reportList.add(report);
    }

    public void removeReport(Report report) {
        reportList.remove(report);
    }

    public Report searchReportByID(int reportID) {
        for (Report report : reportList) {
            if (report.ID == reportID) {
                return report;
            }
        }
        return null;
    }

    public void displayReports() {
        Collections.sort(reportList, Comparator.comparingInt(report -> report.ID));
        System.out.println("All Reports (Sorted by ID):");
        for (Report report : reportList) {
            System.out.println(report.toString());
        }
    }

    @Override
    public String toString() {
        return "Report Collection: " + reportList.toString();
    }
}
