package School;

public class StudentTest {


    String getRollNo(Student abc){
        System.out.println("get roll no Hashcode"+abc.hashCode());

        return "123456";
    }

    Student getSchoolName(Student stud){
        stud.schoolName="new city central school";
       System.out.println("getSchool name hashcode "+stud.hashCode());

        return stud;
    }

    Student getSchoolNameDeepClone(Student student){

        Student clonedStudent= new Student();
        clonedStudent.name=student.name;
        clonedStudent.fatherName=student.fatherName;
        clonedStudent.mobileNo=student.mobileNo;
        clonedStudent.dateOfBirth=student.dateOfBirth;
        clonedStudent.schoolName="Abc";




        return clonedStudent;
    }

    Student getStudentAddress(Student student){

        Student localStudent=new Student();
        localStudent.name=student.name;
        localStudent.fatherName=student.fatherName;
        localStudent.dateOfBirth= student.dateOfBirth;
        localStudent.mobileNo=student.mobileNo;
        localStudent.schoolName=student.schoolName;


        Address studentAddress= new Address();
        studentAddress.studentHouseNo="12";
        studentAddress.studentCity="hyd";
        studentAddress.pinCode="508212";

        localStudent.address=studentAddress;
       // student.address=studentAddress;

        return localStudent;


    }






    public static void main(String[] args) {

        StudentTest studentTest= new StudentTest();

        Student rakeshstudent= new Student();
        rakeshstudent.name="rakesh";
        rakeshstudent.fatherName="srinuu";
        rakeshstudent.mobileNo="1234";
        rakeshstudent.dateOfBirth="1/1/2000";




        Student lokeshstudent= new Student();
        lokeshstudent.name="lokesh";
        lokeshstudent.fatherName="srinuu";
        lokeshstudent.mobileNo="1234";
        lokeshstudent.dateOfBirth="1/1/2000";



        studentTest.getRollNo(rakeshstudent);
        studentTest.getRollNo(lokeshstudent);






       Student latestAdddress= studentTest.getStudentAddress(rakeshstudent);

      // Student latestStudent= studentTest.getSchoolNameDeepClone(rakeshstudent);
//        System.out.println(rakeshstudent.hashCode());
//        System.out.println(latestStudent.hashCode());
       Student latestStudent1= studentTest.getSchoolName(lokeshstudent);


        System.out.println(studentTest.getStudentAddress(lokeshstudent));










//        System.out.println(rakeshstudent.name);
//        System.out.println(rakeshstudent.fatherName);
//        System.out.println(rakeshstudent.mobileNo);
//        System.out.println(rakeshstudent.dateOfBirth);
//        System.out.println(rakeshstudent.schoolName);

     /*   System.out.println(latestStudent.schoolName);


      //  System.out.println(studentTest.getRollNo(rakeshstudent));


        System.out.println("                         ");
        System.out.println("*************************");
        System.out.println("                          ");


        System.out.println(latestStudent1.schoolName);

//        System.out.println(lokeshstudent.name);
//        System.out.println(lokeshstudent.fatherName);
//        System.out.println(lokeshstudent.mobileNo);
//        System.out.println(lokeshstudent.dateOfBirth);
//        System.out.println(rakeshstudent.schoolName);
//
//        String output=studentTest.getRollNo(lokeshstudent);
//
//        System.out.println(output);*/



    }



}
