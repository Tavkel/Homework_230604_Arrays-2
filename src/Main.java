import java.util.Random;

public class Main {
    private static final int[] data = generateIntArray();

    public static int[] generateIntArray() {
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        task1(data);

        System.out.println("\nЗадача 2");
        task2(data);

        System.out.println("\nЗадача 3");
        task3(data);

        System.out.println("\nЗадача 4");
        task4();
    }

    //Задача 1
    //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
    //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
    public static void task1(int[] expensesArray) {
        //int[] expensesArray = generateIntArray();
        var result = 0;
        for (int expense : expensesArray) {
            result += expense;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", result);
    }

    //Задача 2
    //Также бухгалтерия попросила найти минимальную и максимальную трату за день.
    //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
    //«Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
    public static void task2(int[] expensesArray) {
        //int[] expensesArray = generateIntArray();
        int minExpense = expensesArray[0];
        int maxExpense = expensesArray[0];
        for (int expense : expensesArray) {
            if (minExpense > expense) {
                minExpense = expense;
            }
            if (maxExpense < expense) {
                maxExpense = expense;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n", minExpense, maxExpense);
    }

    //Задача 3
    //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
    //Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить
    //на количество дней), и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
    //Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
    public static void task3(int[] expensesArray) {
        //int[] expensesArray = generateIntArray();
        double result = 0.0;
        for (int expense : expensesArray) {
            result += expense;
        }
        result /= expensesArray.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", result);
    }

    //Задача 4
    //В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в
    //обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде
    //массива символов — char[ ].
    //Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде. В
    //качестве данных для массива используйте:
    //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    //В результате в консоль должно быть выведено: Ivanov Ivan.
    //Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву
    //циклом и распечатать его элементы в правильном порядке.
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}