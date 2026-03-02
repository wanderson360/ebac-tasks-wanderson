package br.ebac.wanderson;

public class averageCalculationTask {
    public static void main(String[] args) {
        int[] grades = new int[4];

        grades[0] = 7;
        grades[1] = 9;
        grades[2] = 8;
        grades[3] = 10;

        double media = calculateAverage(grades);
        System.out.println("Média total: " + media);
    }

    private static double calculateAverage(int[] grades) {
        int soma = 0;
        for (int nota : grades) {
            soma += nota;
        }
        return (double) soma / grades.length;
    }
}


