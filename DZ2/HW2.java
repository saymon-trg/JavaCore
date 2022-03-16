package DZ2;

public class HW2 {
    public static void main(String[] args){
    // Тестовый массив с неверным размером
    String[][] str1 = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
    // тестовый массив с неконвертируемым значением
    String[][] str2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "Десять", "11", "12"}, {"13", "14", "15", "16"}};
    // тестовый массив правильный
    String[][] str3 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
    System.out.println(" Обрабатываем массив str3...");
        try {
        System.out.println("Сумма всех элементов массива str3 = " + MyMethodEx(str3));
    } catch (MyArrayDataException | MyArraySizeException e) {
        System.out.println(e);
        System.out.println("Достоверный результат расчета суммы получен быть не может!");
    }
        System.out.println("\n обрабатываем массив str2...");
        try {
        System.out.println("Сумма всех элементов массива str3 = " + MyMethodEx(str2));
    } catch (MyArrayDataException | MyArraySizeException e) {
        System.out.println(e);
        System.out.println("Достоверный результат расчета суммы получен быть не может!");
    }
        System.out.println("\n обрабатываем массив str1...");
        try {
        System.out.println("Сумма всех элементов массива str3 = " + MyMethodEx(str1));
    } catch (MyArrayDataException | MyArraySizeException e) {
        System.out.println(e);
        System.out.println("Достоверный результат расчета суммы получен быть не может!");
    }
}

    public static int MyMethodEx(String[][] str) throws RuntimeException {
        int sum = 0;
        if (str.length != 4 || str[0].length != 4)
            throw new MyArraySizeException("Массив не соответствует размерности 4х4!");
        for (int y = 0; y < str.length; y++) {
            for (int x = 0; x < str[y].length; x++) {
                try {
                    sum += Integer.parseInt(str[y][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В переданном массиве элемент с Array[" + y + "][" + x + "] НЕ может быть конвертирован в число!!!");
                }
            }
        }
        return sum;

    }
}
