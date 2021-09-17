package Main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * Массив введенных чисел
     */
    private static List<Integer > array = new ArrayList<>();

    public static void main(String[] args) {

        inputNumbers();
        printConsole(calcSumm(array),calcSMultipl(array));
    }

    /**
     * Функция в которой осуществлен ввод и подсчет нужных значений
     */
    public static void inputNumbers(){

        //Объект для ввода данных с консоли
        Scanner in = new Scanner(System.in);

        System.out.println("Ввод чисел осуществляется до того, как будет введено не целое число. " +
                "Числа можно вводить через 'space' или через 'enter'");
        System.out.print("Введите целое число: ");


        while (in.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            array.add(in.nextInt()); // считывает целое число с потока ввода и добавляет в массив чисел
        }

    }

    /**
     * Метод для подсчета суммы чисел
     * @param numbers числа, сумму которых надо посчитать
     * @return Сумма чисел
     */
    public static int calcSumm(List<Integer> numbers){

        int summ = 0;

        for (int i = 0; i < numbers.size(); i++)
            summ += numbers.get(i);

        return summ;
    }

    /**
     * Метод для подсчета произведения чисел
     * @param numbers числа, произведение которых нужно посчитать
     * @return Произведение чисел
     */
    public static long calcSMultipl(List<Integer> numbers){

        if (numbers.size() == 0) return 0;

        int multipl = 1;

        for (int i = 0; i < numbers.size(); i++)
            multipl *= numbers.get(i);

        return multipl;
    }

    /**
     * Метод для вывода значений
     * @param summ сумма чисел
     * @param multipl произведение чисел
     */
    private static void printConsole(int summ, long multipl){
        System.out.printf("Сумма чисел: %d\nПроизведение чисел: %d",summ,multipl);
    }
}
