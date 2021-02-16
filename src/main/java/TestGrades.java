class TestGrades {
    public static void main(String[] args) {
        Grades grades = new Grades();

        grades.add (1, 1, 3, 5, 7, 6, 8);
        System.out.println(grades.average());
        System.out.println(grades.last());
    }
}