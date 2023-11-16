import java.util.ArrayList;
import java.util.List;

public class ManageStudent {
    List<Student> studentList = new ArrayList<>();

    ManageStudent() {
        studentList.add(new Student(32 , "A" , 7 , 6, 8));
        studentList.add(new Student(20, "B" , 6 , 7, 9));
        studentList.add(new Student(34 , "C" , 4 , 2, 1));
        studentList.add(new Student(32 , "D" , 10 , 10, 10));
    }

    public void addStudent(Student Student) {
        studentList.add(Student);
    }

    public void showStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void updateStudent(int id, Student Student) {
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                index = i;
            }
        }
        this.studentList.set(index, Student);
    }

    public void deleteStudent(int id) {
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                index = i;
            }
        }
        this.studentList.remove(index);
    }

    public void information() {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            System.out.println("Số thứ tự: " + (i + 1) +
                    ", Tên học sinh: " + student.getName() +
                    ", Average Score: " + student.calculateAverageScore());
        }
    }

    public void exellentStudent() {
        for (Student student : studentList) {
            if (student.calculateAverageScore() > 8.5 &&
                    student.getMathScore() > 8.5 &&
                    student.getPhysicScore() > 8.5 &&
                    student.getChemicalScore() > 8.5) {
                System.out.println(student);
            }
        }
    }

    public void status() {
        for (Student student : studentList) {
            if (student.calculateAverageScore() < 5 ||
                    student.getMathScore() < 5 ||
                    student.getPhysicScore() < 5 ||
                    student.getChemicalScore() < 5) {
                System.out.println("Tên học sinnh:"+ student.getName() +"Trượt");
            } else {
                System.out.println("Tên học sinnh:"+ student.getName() +"Lên lớp");
            }
        }
    }
}
