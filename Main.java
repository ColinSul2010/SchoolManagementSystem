import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher Colin = new Teacher(1, "Colin", 10000);
        Teahcer Rogan = new Teacher(2, "Rogan", 10000);
        Teacher Amy = new Teacher(3, "Amy", 10000);

        ArrayList<Teacher> teacherList = new ArrayList<>() {
            teacherList.add(Colin);
            teacherList.add(Rogan);
            teacherList.add(Amy);
        }
            Student Peter = new Student("Peter", A, 4);
            Student David = new Student("David", B, 5);
            Student Barry = new Student("Barry", A, 6);

        List<Student> studentList = new ArrayList<>(){
            studentList.add(Peter);
            studentList.add(David);
            studentList.add(Barry);
        }
    }
}