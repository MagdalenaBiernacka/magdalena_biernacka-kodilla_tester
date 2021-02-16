public class Grades {
    private int[] gradesStorage = new int[10];
    private int numberOfGrades;

    public void add(int... newGrades) {
        for (int newGradesIndex = 0; newGradesIndex < newGrades.length; newGradesIndex++) {
        this.gradesStorage[this.numberOfGrades++] = newGrades[newGradesIndex];
        }
    }

    public int last() {
        if (this.numberOfGrades == 0) {
            return 0;
        } else
            return this.gradesStorage[this.numberOfGrades -1];
    }

    public double average() {
        double sum = 0;

        if (this.numberOfGrades == 0) {
            return 0;
        }

        for (int newGradesIndex = 0; newGradesIndex < this.numberOfGrades; newGradesIndex++) {
            sum = sum + this.gradesStorage[newGradesIndex];
        }
        return sum / this.numberOfGrades;
    }
}