package problem;

class Student {
    private String name;
    private String department;
    private int id;
    private double score;

    public Student(String name, String department, int id, double score) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.score = score;
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", id=" + id +
                ", score=" + score +
                '}';
    }
}