package studentMarks;

public class Subject {

   public  String subjectName;
    public  int  marks;

     public String result;

     public Subject(String subjectName,int marks){
         this.subjectName=subjectName;
         this.marks=marks;



     }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
