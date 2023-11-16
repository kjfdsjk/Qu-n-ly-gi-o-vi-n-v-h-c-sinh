import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ManageTeacher {
    List<Teacher> teacherList = new ArrayList<>();

    ManageTeacher() {

    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    public void showTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    public void updateTeacher(int id, Teacher teacher) {
        int index = -1;
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {
                index = i;
            }
        }
        this.teacherList.set(index, teacher);
    }

    public void deleteTeacher(int id) {
        int index = -1;
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {
                index = i;
            }
        }
        this.teacherList.remove(index);
    }

    public void findBySubject(String teachingSubject) {
        for (Teacher teacher : teacherList) {
            if (teacher.getTeachingSubject().equals(teachingSubject)) {
                System.out.println(teacher);
            }
        }
    }

    public void sortUpBySalary() {
        List<Teacher> listSortUp = new ArrayList<>(teacherList);
        listSortUp.sort(Comparator.comparing(Teacher::getSalary));
        for (Teacher teacher:listSortUp) {
            System.out.println(teacher);
        }
    }

}

