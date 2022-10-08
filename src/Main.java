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
// Задача 2.1

        int initialContribution = 15000;
        int finalAmountSavings = 0 + initialContribution ;
        for ( int z = 1; finalAmountSavings < 12_000_000; z++) {
            finalAmountSavings = finalAmountSavings + (finalAmountSavings / 100) *7;
            System.out.println("Месяц " + z + " сумма накоплений равна " + finalAmountSavings);
        }
// Задача 2.2

        int initialContribution1 = 15000;
        int finalAmountSavings1 = 0 + initialContribution1 ;
        for ( int z = 1; finalAmountSavings1 < 12_000_000; z++) {
            finalAmountSavings1 = finalAmountSavings1 + (finalAmountSavings1 / 100) *7;
            if (z % 6 == 0)
            System.out.println("Месяц " + z + " сумма накоплений равна " + finalAmountSavings1);
        }








    }
}



