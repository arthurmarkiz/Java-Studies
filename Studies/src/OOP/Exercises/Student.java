package OOP.Exercises;

public class Student {
    private String name;
    private double first;
    private double second;
    private double third;
    public Student(String name, double first, double second, double third) {
        this.name = name;
        if(first <= 30 && first > 0) {
            this.first = first;
        } else {
            this.first = 0;
        }
        if(second <= 35 && second > 0) {
            this.second = second;
        } else {
            this.second = 0;
        }
        if(third <= 35 && third > 0) {
            this.third = third;
        } else {
            this.third = 0;
        }
    }
    private double finalGrade() {
        return this.first + this.second + this.third;
    }
    public void displayResult() {
        String result = finalGrade() >= 60 ? "PASSOU" : "FALHOU";
        if(result.equals("FALHOU")) {
            double missingPoints = 60 - finalGrade();
            System.out.printf("Grade Final = %.2f%n%s%nFaltou %.2f ponto(s)", finalGrade(), result, missingPoints);
        } else {
            System.out.printf("Grade Final = %.2f%n%s", finalGrade(), result);
        }
    }

}
