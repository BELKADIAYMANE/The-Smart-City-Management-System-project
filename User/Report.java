/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;


/**
 *
 * @author AYMEN
 */
public class Report {
    public int ID;
    public String date;
    public String time;
    public String content;
    public boolean processed;
    public User user;
    public ReportStatus status;

    public Report(int ID, String date, String time, String content, User user, ReportStatus status) {
        this.ID = ID;
        this.date = date;
        this.time = time;
        this.content = content;
        this.processed = false;
        this.user = user;
        this.status = ReportStatus.PENDING;
    }

    public void handleReport() {
        processed = true;
    }

    public void updateReport(int newID, String newtime, String newcontent, User newuser ) {
        this.ID=newID;
        this.time=newtime;
        this.content=newcontent;
        this.user=newuser;
        
    }

    public void displayStatus() {
    switch (status) {
        case PENDING:
            System.out.println("The report is pending");
            break;
        case IN_PROGRESS:
            System.out.println("The report is in progress");
            break;
        case COMPLETED:
            System.out.println("The report is completed");
            break;
        case CANCELED:
            System.out.println("The report is cancelled");
            break;
        default:
            System.out.println("Unknown report status");
            break;
    }
}

    @Override
    public String toString() {
        return "Report ID: " + ID + "\nDate: " + date + "\nTime: " + time + "\nContent: " + content
                + "\nProcessed: " + processed + "\nUser: " + user.firstName + " " + user.lastName;
    }
}





