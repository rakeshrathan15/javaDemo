package Studentpass;

public class StudentMain {

    public static void main(String[] args) {

        StudentProcessService processService = new StudentProcessService();
        Student student= new Student();

        student.englishMarks=50;
        student.mathsMarks=45;

        String result = processService.validation(student);
        System.out.println(result);





    }


}
