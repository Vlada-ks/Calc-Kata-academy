import org.example.Roman;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws Exception {
        System.out.println("Введите пример (арабские или римские числа от 1 до 10): ");
        String input = "";
        String calc = Main.calc(input);
    }

    public static String calc( String input) throws Exception {
        String str = sc.nextLine();
        String str1 = str.replaceAll(" ", ""); //убираем пробелы
        str1 = str1.toUpperCase(); // верхний регистр для римских
        String[] oper = str1.split("[+\\-*/]"); //делим строку по знаку

        int num1;
        int num2;

        boolean romans = false;

        try {
            num1 = Integer.parseInt(oper[0]);
            num2 = Integer.parseInt(oper[1]);
        } catch (NumberFormatException e) {
            Roman romanNum1 = Roman.valueOf(oper[0]);
            Roman romanNum2 = Roman.valueOf(oper[1]);
            num1 = romanNum1.getConverter();
            num2 = romanNum2.getConverter();
            romans = true;
        }

        if (((1 > num1) || (num1 > 10)) || ((1 > num2) || (num2 > 10))) {
            throw new Exception("Калькулятор принимает на вход числа от 1 до 10 включительно, не более");
        } else if (oper.length <= 1) {
            throw new Exception("т.к. строка не является математической операцией");
        } else if (oper.length != 2) {
            throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        if (!romans) {

            if (str.contains("+")) {
                int resultar = num1 + num2;
                System.out.println(resultar);
                return Integer.toString(resultar);
            }
            if (str.contains("-")) {
                int resultar = num1 - num2;
                System.out.println(resultar);
                return Integer.toString(resultar);
            }
            if (str.contains("/")) {
                int resultar = num1 / num2;
                System.out.println(resultar);
                return Integer.toString(resultar);
            }
            if (str.contains("*")) {
                int resultar = num1 * num2;
                System.out.println(resultar);
                return Integer.toString(resultar);
            }

        }


        if (romans) {
            if (str.contains("+")) {
                int result = num1 + num2;
                int ordinal;
                ordinal = result - 1;
                if (ordinal < 0) {
                    throw new Exception("//т.к. в римской системе нет отрицательных чисел и 0");
                }
                Roman resultRoman = Roman.values()[ordinal];
                System.out.println(resultRoman);
                return resultRoman.toString();
            }
            if (str.contains("-")) {
                int result = num1 - num2;
                int ordinal;
                ordinal = result - 1;
                if (ordinal < 0) {
                    throw new Exception("//т.к. в римской системе нет отрицательных чисел и 0");
                }
                Roman resultRoman = Roman.values()[ordinal];
                System.out.println(resultRoman);
                return resultRoman.toString();
            }
            if (str.contains("*")) {
                int result = num1 * num2;
                int ordinal;
                ordinal = result - 1;
                if (ordinal < 0) {
                    throw new Exception("//т.к. в римской системе нет отрицательных чисел и 0");
                }
                Roman resultRoman = Roman.values()[ordinal];
                System.out.println(resultRoman);
                return resultRoman.toString();
            }
            if (str.contains("/")) {
                int result = num1 / num2;
                int ordinal;
                ordinal = result - 1;
                if (ordinal < 0) {
                    throw new Exception("//т.к. в римской системе нет отрицательных чисел и 0");
                }
                Roman resultRoman = Roman.values()[ordinal];
                System.out.println(resultRoman);
                return resultRoman.toString();

            }
        }

    return "throw new Exception(//т.к.используются одновременно разные системы счисления);"; }

}









