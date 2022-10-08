public class Main {
    public static void main(String[] args) {
// Задача 1.1
        int contributionRob = 15000;
        int totAl = 0;
        for (int q = 0; totAl < 2459000; q++) {
            totAl = totAl + contributionRob;
            totAl = totAl + totAl / 100;
            System.out.println("Месяц " + q + " сумма накопления равна " + totAl);
            System.out.println(totAl);
            System.out.println(q);
        }
// Задача 1.2
        int a = 0;
        while (a < 10) {
            System.out.print(++a + " ");
        }
        System.out.println();

        for (int q = 10; q >0; q--) {
            System.out.print(q + " ");
        }
 // Задача 1.3
        System.out.println();
        int populationСountry = 12_000_000;
        int birthRatePulationYear = (populationСountry / 1000) * 17;
        int mortalityPopulationYear = (populationСountry / 1000) * 8;
        int populationGrowthYear = birthRatePulationYear - mortalityPopulationYear;

        for (a = 1; a <=10; a++) {
            populationСountry = populationСountry + populationGrowthYear;
            System.out.println("Год " + a + " численность населения составляет " + populationСountry);
        }





    }
}



