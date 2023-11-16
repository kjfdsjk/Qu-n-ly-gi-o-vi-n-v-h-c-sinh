public class Teacher {
    private int id;
    private String name;
    private String teachingSubject;
    private double salary;

    public Teacher(int id, String name, String teachingSubject, double salary) {
        this.id = id;
        this.name = name;
        this.teachingSubject = teachingSubject;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teachingSubject='" + teachingSubject + '\'' +
                ", salary=" + salary +
                '}';
    }
}

