import java.util.Random;

public class Test18 {
    public static void main(String[] args) {
        int n = 10; // количество массивов
        int length = 5; // длина массивов
        int[][] arrays = new int[n][length];

        // генерируем массивы и выводим их на экран
        for (int i = 0; i < n; i++) {
            arrays[i] = generateArray(length);
            System.out.println("Массив " + (i + 1) + ": " + arrayToString(arrays[i]) + ", сумма элементов: " + sumArray(arrays[i]));
        }

        // находим массив с максимальной суммой элементов
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (sumArray(arrays[i]) > sumArray(arrays[maxIndex])) {
                maxIndex = i;
            }
        }

        // выводим найденный массив и его сумму элементов на экран
        System.out.println("Массив с максимальной суммой элементов: " + arrayToString(arrays[maxIndex]) + ", сумма элементов: " + sumArray(arrays[maxIndex]));
    }

    // функция для генерации случайного массива
    public static int[] generateArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(10); // генерируем случайное число от 0 до 9
        }
        return array;
    }

    // функция для подсчета суммы элементов массива
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    // функция для преобразования массива в строку для вывода на экран
    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
