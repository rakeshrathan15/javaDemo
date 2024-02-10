package studentAttendanceSheet;

public class Attendance {


    int presentDays;
    int totalDays;


    public Attendance(int presentDays, int totalDays) {
        this.presentDays = presentDays;
        this.totalDays = totalDays;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "presentDays=" + presentDays +
                ", totalDays=" + totalDays +
                '}';
    }







}
