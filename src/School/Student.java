package School;

public class Student {

   public String name;

    public String fatherName;

     public String mobileNo;
     public String dateOfBirth;
     public String schoolName;

     public Address address;

     public Subject subject;
     public Marks marks;

 @Override
 public String toString() {
  return "Student{" +
          "name='" + name + '\'' +
          ", fatherName='" + fatherName + '\'' +
          ", mobileNo='" + mobileNo + '\'' +
          ", dateOfBirth='" + dateOfBirth + '\'' +
          ", schoolName='" + schoolName + '\'' +
          ", address=" + address +
          ", subject=" + subject +
          ", marks=" + marks +
          '}';
 }
}
