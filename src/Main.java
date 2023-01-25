public class Main {
    public static void main(String[] args) {
        //first task
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month = month + 1;
            System.out.println("Month " + month + ". Total is " + total);
        }
        //second task
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 10;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        //third task
        int totalPeople = 12_000_000;
        int born = 17;
        int death = 8;
        i = 1;
        while (i <= 10) {
            totalPeople = totalPeople + (totalPeople / 1000 * born) - (totalPeople / 1000 * 8);
            System.out.println("Год " + i + ", численность населения составляет " + totalPeople);
            i ++;
        }
        //fourth task
        double deposit = 15000;
        i = 1;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit * 0.07;

            System.out.println("Месяц " + i + ", сумма накоплений " + deposit);
            i ++;
        }
        //fifth task
        deposit = 15000;
        i = 1;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit * 0.07;

            System.out.println("Месяц " + i + ", сумма накоплений " + deposit);
            i = i + 6;
        }
        //sixth task
        deposit = 15000;
        i = 1;
        while (i <=108) {
            deposit = deposit + deposit * 0.07;

            System.out.println("Месяц " + i + ", сумма накоплений " + deposit);
            i++;
        }
        //seventh task
        int friday = 2;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт");
            friday = friday + 7;
        }
        //eighth task
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int finalYear = currentYear + 100;

        for (i = startYear; i <= finalYear; ++i) {
            if (i % 79 == 0) {
                System.out.println("Комета! " + i);
            }
        }
    }
}