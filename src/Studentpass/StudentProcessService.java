package Studentpass;

public class StudentProcessService {

   String  validation(Student student){

       int passMarks=35;
       if(passMarks <= (student.englishMarks) && passMarks <= (student.mathsMarks)){
           return "Student is passed";
       } else {
           return "student is failed";
       }


    }



}
