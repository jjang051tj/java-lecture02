package problem;

public class Grade {
    int math;
    int science;
    int english;

    double average() {

        double avg = (math + science + english) / 3.0;
        return Math.round(avg*100)/(double)100;
    }

    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }
}
