package studentMarks;

//import School.Marks;
//import School.Subject;

public class Student {


    public String studentName;

    public String fatherName;
    public String dateOfBirth;
    public String mobileNo;
    public Marks marks;

   public String result;

    public Student(String studentName, String fatherName, String dateOfBirth, String mobileNo) {
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
        this.mobileNo = mobileNo;
       // this.marks = marks;
       // this.result = result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", marks=" + marks +
                ", result='" + result + '\'' +
                '}';
    }
}
