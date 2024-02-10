package privateDemo;

import protectedDemo.Address;

public class Student extends Address {

    private String studentName;

    private String fatherName;

    private String mobileNO;




    /*public Student(String address) {
        super(address);
    }*/



    public Student(String studentName, String fatherName, String mobileNO,String address, int number) {
       super(address, number);
        //super(address);
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.mobileNO = mobileNO;
       // this.address=address;
        // this.number=number;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getFatherName() {
        return fatherName;
    }



    public String getMobileNO() {
        return mobileNO;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNO='" + mobileNO + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }
}
