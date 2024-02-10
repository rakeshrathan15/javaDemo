package studentMarks;



public class StudentMarksTest {

     public   boolean isPassed(Subject subject){
         System.out.println("From isPassed "+subject.subjectName);
         return subject.marks>=35;
     }

     public boolean isPassedInHindi(Subject subject){
              System.out.println("From Is Passed IN Hindi "+ subject.subjectName);
               return  subject.marks>=21;

     }






    Student getResult(Student inputStudent){

        if(isPassed(inputStudent.marks.englishSubject)  ){

           inputStudent.marks.englishSubject.result="pass";
        }else{
            inputStudent.marks.englishSubject.result="Fail";

        }
        if(isPassed(inputStudent.marks.teluguSubject)  ){

            inputStudent.marks.teluguSubject.result="pass";
        }else{
            inputStudent.marks.teluguSubject.result="Fail";

        }
        if(isPassed(inputStudent.marks.hindiSubject)  ){

            inputStudent.marks.hindiSubject.result="pass";
        }else{
            inputStudent.marks.hindiSubject.result="Fail";

        }
        if(isPassed(inputStudent.marks.mathsSubject)  ){

            inputStudent.marks.mathsSubject.result="pass";
        }else{
            inputStudent.marks.mathsSubject.result="Fail";

        }
        if(isPassed(inputStudent.marks.scienceSubject)  ){

            inputStudent.marks.scienceSubject.result="pass";
        }else{
            inputStudent.marks.scienceSubject.result="Fail";

        } if(isPassed(inputStudent.marks.socialSubject)  ){

            inputStudent.marks.socialSubject.result="pass";
        }else{
            inputStudent.marks.socialSubject.result="Fail";

        }

        if( inputStudent.marks.englishSubject.result.equals("pass")
                && inputStudent.marks.teluguSubject.result.equals("pass")
                && inputStudent.marks.hindiSubject.result.equals("pass")
                && inputStudent.marks.mathsSubject.result.equals("pass")
                && inputStudent.marks.scienceSubject.result.equals("pass")
                && inputStudent.marks.socialSubject.result.equals("pass")


        ){
            inputStudent.result="Pass";

        } else {
            inputStudent.result="Fail";

        }




        return inputStudent;
    }




    public static void main(String[] args) {

        Subject teluguSubject =new Subject("telugu",73);
      //  teluguSubject.marks=72;
      //  teluguSubject.subjectName="telugu";

        Subject hindiSubject= new Subject("hindi",60);
     //   hindiSubject.marks=12;
     //   hindiSubject.subjectName="hindi";

        Subject mathsSubject= new Subject("Maths",88);
     //   mathsSubject.marks=88;
     //   mathsSubject.subjectName="maths";

        Subject socialSubject= new Subject("Social",77);
     //   socialSubject.marks=77;
     //   socialSubject.subjectName="social";

        Subject scienceSubject= new Subject("Science",80);
     //   scienceSubject.marks=99;
     //   scienceSubject.subjectName="science";

        Subject englishSubject= new Subject("English",86);
     //   englishSubject.marks=86;
     //   englishSubject.subjectName="english";

       Marks marks=new Marks(teluguSubject,hindiSubject,englishSubject,mathsSubject,scienceSubject,socialSubject);
     /*  marks.englishSubject=englishSubject;
       marks.hindiSubject=hindiSubject;
       marks.mathsSubject=mathsSubject;
       marks.scienceSubject=scienceSubject;
       marks.teluguSubject=teluguSubject;
       marks.socialSubject=socialSubject; */

       Student student= new Student("Rakesh","Srinivas","15/01/1999","7013776567");
      student.marks=marks;

      /* student.studentName="Rakesh";
       student.fatherName="Srinivas";
       student.dateOfBirth="15/01/1999";
       student.mobileNo="7013776567"; */

       StudentMarksTest studentMarksTest= new StudentMarksTest();
        Student latestresult  = studentMarksTest.getResult(student);

        System.out.println(studentMarksTest.getResult(student));

        System.out.println(latestresult);





    }
}
