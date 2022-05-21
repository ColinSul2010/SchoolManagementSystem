public class School {
    import java.util.List;

    private List <Teacher> teachers;
    private List <Student> students;
    private int totalMoneySpent;
    private int totalMoneyEarned;

public School(List <Teacher> teachers, List <Student> students){
    totalMoneyEarned = 0;
    totalMoneySpent = 0;

    this.teacher = teachers;
    this.student = students;

    public List <teachers> getTeachers(){
        return teachers;
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public List <students> getStudents(){
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }
    public static void getTotalMoneyEarned(int moneyEarned){
        totalMoneyEarned = totalMoneyEarned + moneyEarned;
    }
    public static void getTotalMoneySpent(int moneySpent){
        totalMoneySpent = totalMoneySpent - moneySpent;
    }
  }
}
