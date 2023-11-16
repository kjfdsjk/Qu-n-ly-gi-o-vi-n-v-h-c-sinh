public class Student{
    private int id;
    private String name;
    private int mathScore;
    private int physicScore;
    private int chemicalScore;

    public double calculateAverageScore() {
        return (mathScore + physicScore + chemicalScore) / 3.0;
    }


    public Student(int id, String name, int mathScore, int physicScore, int chemicalScore) {
        this.id = id;
        this.name = name;
        this.mathScore = mathScore;
        this.physicScore = physicScore;
        this.chemicalScore = chemicalScore;
    }

    public Student() {

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

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getPhysicScore() {
        return physicScore;
    }

    public void setPhysicScore(int physicScore) {
        this.physicScore = physicScore;
    }

    public int getChemicalScore() {
        return chemicalScore;
    }

    public void setChemicalScore(int chemicalScore) {
        this.chemicalScore = chemicalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mathScore=" + mathScore +
                ", physicScore=" + physicScore +
                ", chemicalScore=" + chemicalScore +
                '}';
    }
}
