public class Main {
    public static void main(String[] args)  {
        Student s1=new Student();
        s1.scoreListMaker();
        s1.showScoreList();
        try {
            Student s2 = (Student) s1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
