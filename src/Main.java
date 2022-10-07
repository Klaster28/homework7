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
        int a = 1;
        while (a <= 10) {
            System.out.println (a + " ");
            a++;
        }


    }
}