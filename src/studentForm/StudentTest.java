package studentForm;

public class StudentTest {

    Student getRollNo(Student abc){
        return abc;

    }



    public static void main(String[] args) {

        Student pavanStudent= new Student();
        pavanStudent.name="pavan";
        pavanStudent.fatherName="suresh";
        pavanStudent.dateOfBirth="1/1/1999";


        Student nikhilStudent=new Student();
        nikhilStudent.name="nikhil";
        nikhilStudent.dateOfBirth="2/2/1998";


        StudentTest studenttest= new StudentTest();
        studenttest.getRollNo(pavanStudent);
        studenttest.getRollNo(nikhilStudent);

        System.out.println(pavanStudent.name);

        Student abc=studenttest.getRollNo(pavanStudent);
        System.out.println(abc);







    }



}
