package studentAttendanceSheet;

    public class Student {

    public String studentName;
    public  Attendance attendance ;
    public String rollNo;


     public Student(String studentName,String rollNo,Attendance attendance){

         this.studentName=studentName;
         this.attendance=attendance;
         this.rollNo=rollNo;

     }



        @Override
        public String toString() {
            return "Student{" +
                    "studentName='" + studentName + '\'' +
                    ", attendance=" + attendance +
                    ", rollNo='" + rollNo + '\'' +
                    '}';
        }
    }
