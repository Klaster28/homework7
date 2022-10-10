public class Main {
    public static void main(String[] args) {
// Задача 1.1
        int contributionRob = 15000;
        int totAl = 0;
        for (int q = 1; totAl < 2459000; q++) {
            totAl += contributionRob;
            totAl += totAl / 100;
            System.out.println("Месяц " + q + " сумма накопления равна " + totAl);

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
            populationСountry += populationGrowthYear;
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
// Задача 2.3
        System.out.println ("Задача 2.3");
        int initialContribution2 = 15000;
        int finalAmountSavings2 = 0 + initialContribution2 ;
        for ( int z = 1; finalAmountSavings2 < 12_000_000; ++z) {
            finalAmountSavings2 += (finalAmountSavings2 / 100) *7;
            if (z % 6 == 0)
                System.out.println("Месяц " + z + " сумма накоплений равна " + finalAmountSavings2);
        }
// Задача 2.4

        int friday = 2;
        for (int i = 2; i <= 31; i = i+7) {
            System.out.println("Сегодня пятница, " + i + " число, пора подготовить отчет!");
        }
// Задание 3.1

        int firstYearCalculationComet = 1822;
        int lastYearCalculationComet = 2122;
        for (int e = 0; e < lastYearCalculationComet; e = e + 79) {
            if (e > firstYearCalculationComet && e < lastYearCalculationComet)
            System.out.println(e);
        }

// Задание 3.2

        int d = 2;
        for (int i = 1; i <= 10; i++ ) {

                System.out.println (i + " * " + d + " = " + i * d);
            }

        }









    }




