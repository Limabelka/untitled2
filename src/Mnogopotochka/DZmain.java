package Mnogopotochka;


//1. Написать программу, бесконечно считывающую
//пользовательские числа из консоли.
//Эти числа представляют собой количество секунд.
//При каждом вводе числа, должна создаваться задача,
// которая засыпает на введённое число секунд и затем выводит "Я спал N секунд".
//Однако нужно сделать так, чтобы все задачи выполнялись в одном и том же потоке в порядке ввода.
// Т.е. в программе есть 2 потока: главный и поток для выполнения всех задач по очереди.
//При вводе отрицательного числа программа должна завершать свою работу.
//Второе решение - несколько потоков в пуле. Посчитать кол-во обработанных задач каждым потоком

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DZmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ВВедите количество секунд");
            long sec = scanner.nextLong();
            if (sec <0) {
                break;
            }
            try {
                MyThead.sleep(sec * 1000);
                System.out.println("Я спал " + sec + " сек");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
