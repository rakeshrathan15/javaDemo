package teacherForm;



public class Teacher {


    String teacherName=null;

    String subject;

    int experience=2;


    public static void main(String[] args) {

        Teacher teacher= new Teacher();

      String result=teacher.teacherName="Pavan";

      int result1 =teacher.experience=2;

        System.out.println(result);
        System.out.println(result1);


    }



}
