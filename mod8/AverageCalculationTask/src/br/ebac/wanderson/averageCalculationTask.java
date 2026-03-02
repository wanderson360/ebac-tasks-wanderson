package br.ebac.wanderson;

public class averageCalculationTask {
    public static void main(String[] args) {
        int[] grades = new int[4];

        grades[0] = 7;
        grades[1] = 9;
        grades[2] = 8;
        grades[3] = 10;

        double average = calculateAverage(grades);
        System.out.println("Média total: " + average);
    }

    private static double calculateAverage(int[] grades) {
        int sumOfGrades = 0;
        for (int grade : grades) {
            sumOfGrades += grade;
        }
        return (double) sumOfGrades / grades.length;
    }
}


