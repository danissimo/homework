package ru.list.real_pcy;

import java.util.Scanner;

/**
 * Создать массив, который будет отображать количество корма для котов. То есть
 * если food[1] = 5, то у черного кота под номером 1 будет пять пакетиков еды.
 * Сама задача:
 * Создать функции, которые позволяют:
 * добавить или убавить еды у конкретного кота
 * добавить или убавить еды у всех котов сразу
 * добавить или убавить еды у четных или нечетных котов
 * Класс со статик массивом
 * + по аналогии с задачей "угадай число"
 * цикл ввод, пока пользователь не введет число 666
 * то есть как ввел 666, то выйти из программы
 * <p>
 * номер кота
 * сколько добавить
 * пример:
 * 2 и -3 - это типа отобрать у суки
 * в миске не может быть меньше 0 и больше 7 пакетиков корма
 * после ввода программа каждый раз выводит у кого сколько корма и меню
 */

public class CatFeeder {
    static String[] catsName = new String[]{"Некко", "Отто Фриш", "Эдвард Теллер",
            "Ричард Фейнман", "Роберт Оппенгеймер", "Энрико Ферми", "Лапусик"};
    static int[] catsFeeders = new int[7];
    static Scanner scanner = new Scanner(System.in);

// static int sc = scanner.nextInt();
// static int foodCount = scanner.nextInt();
// static int catNumber = scanner.nextInt();

    public static void main(String[] args) {
        menu();
// for (int personInput = scanner.nextInt(); personInput != 666; menu()) {
// printAllCatsFood();
// }
    }

    private static void menu() {
        /* 1. Показать меню действий
         * 2. Получить ввод пользователя
         * 3. Вызвать команду
         * 4. Вывести результат команды (у кого сколько корма)
         * 5. Зациклить с 1-4 пункт, пока пользователь не выйдет из программы
         * */

        do {
            System.out.println("Что будем делать?" +
                    "\n 1 - Накормим одного кота;" +
                    "\n 2 - Накормим всех котов;" +
                    "\n 3 - Накормим чётных котов;" +
                    "\n 4 - Накормим нечётных котов;" +
                    "\n 666 - Выйти");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Сколько еды положить? (можно отнять через знак минус)");
                    int foodCount = scanner.nextInt();
                    System.out.println("Какому коту?");
                    int catNumber = scanner.nextInt();
                    feedOneCat(foodCount, catNumber);
                    printAllCatsFood();
                    break;
                case 2:
                    System.out.println("Сколько еды положить? (можно отнять через знак минус)");
                    feedAllCats(scanner.nextInt());
                    printAllCatsFood();
                    break;
                case 3:
                    System.out.println("Сколько еды положить? (можно отнять через знак минус)");
                    feedOddAndNonOddCats(scanner.nextInt(), true);
                    printAllCatsFood();
                    break;
                case 4:
                    System.out.println("Сколько еды положить? (можно отнять через знак минус)");
                    feedOddAndNonOddCats(scanner.nextInt(), false);
                    printAllCatsFood();
                    break;
                default:
                    System.out.println("Неверный набор!");
                    break;
                case 666:
                    System.out.println("Пока!");
                    return;
            }
        } while (true);
    }
// printAllCatsFood();
//// menu(sc, foodCount, catNumber);
// menu();
// }

// public static void scanners() {
// int sc = scanner.nextInt();
// int foodCount = scanner.nextInt();
// int catNumber = scanner.nextInt();
// }

    private static void feedOddAndNonOddCats(int foodCount, boolean isEven) {
        if (isEven) {
            for (int i = 1; i < catsFeeders.length; i += 2) {
                feedOneCat(foodCount, i);
            }
        } else {
            for (int i = 0; i < catsFeeders.length; i += 2) {
                feedOneCat(foodCount, i);
            }
        }
    }

    private static void feedAllCats(int foodCount) {
        for (int i = 0; i < catsFeeders.length; i++) {
            feedOneCat(foodCount, i);
        }
    }

    private static void feedOneCat(int foodCount, int catNumber) {

        int sum = catsFeeders[catNumber] + foodCount;
        if (sum > 7) {
            System.out.println("У " + catsName[catNumber] + " и так полная миска. Не удалось покормить " + catsName[catNumber]);
            return;
        }
        if (sum < 0) {
            System.out.println("Это жестоко:( Вы отнимите у " + catsName[catNumber] + " всю еду. Мы не позволим!");
            return;
        }
        catsFeeders[catNumber] = catsFeeders[catNumber] + foodCount;
    }


    private static void printAllCatsFood() {
        for (int i = 0; i < catsFeeders.length; i++) {
            System.out.println("У кота " + catsName[i] + " в миске " + catsFeeders[i] + " еды.");
        }
    }
}