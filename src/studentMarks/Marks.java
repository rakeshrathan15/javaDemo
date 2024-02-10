package studentMarks;

//import School.Subject;

public class Marks {

   public  Subject teluguSubject;

  public   Subject hindiSubject;

   public  Subject mathsSubject;

  public   Subject socialSubject;

   public Subject scienceSubject;
   public  Subject englishSubject;

    public Marks(Subject teluguSubject, Subject hindiSubject, Subject mathsSubject, Subject socialSubject, Subject scienceSubject, Subject englishSubject) {
        this.teluguSubject = teluguSubject;
        this.hindiSubject = hindiSubject;
        this.mathsSubject = mathsSubject;
        this.socialSubject = socialSubject;
        this.scienceSubject = scienceSubject;
        this.englishSubject = englishSubject;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "teluguSubject=" + teluguSubject +
                ", hindiSubject=" + hindiSubject +
                ", mathsSubject=" + mathsSubject +
                ", socialSubject=" + socialSubject +
                ", scienceSubject=" + scienceSubject +
                ", englishSubject=" + englishSubject +
                '}';
    }
}
