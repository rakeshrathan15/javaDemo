package privateDemo;

public class PrivateTest {


    public static void main(String[] args) {
        Student student= new Student("rakehs","srinu","70136677","srpt",123);




        String  result=student.getStudentName();
        String  result1=student.getFatherName();
        System.out.println(result);
        System.out.println(result1);



        System.out.println(student);



    }



}
