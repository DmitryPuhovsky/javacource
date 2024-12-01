package ru.top.javacource.basic.topic3.arrays;

/**
 * Массивы
 */
public class Arrays {

    public static void main(String[] args) {

        int[] intArray = new int[3]; //Создание пустого одномерного массива типа int с длиной 3
        Integer[] shortArray = new Integer[5]; //Создание пустого одномерного массива типа Integer с длиной 5
        double[] doubleArray = new double[]{1.2, 2.3, 3.4}; //Создание одномерного массива типа double с инициализацией
        String[] stringArray = {"one", "two", "three"}; //Создание массива строк с инициализацией. Сокращенная запись,
                                                        //возможно только в месте объявления переменной


        long[] longArray = null; //Присвоение null ссылке массива типа long


        int length = intArray.length; //Получение длины массива


        intArray[0] = 2; //Запись 2 в массив по индексу 0. Первый элемент массива равен 0, второй 1 и т.д.
        double value = doubleArray[2]; //Получение значения третьего элемента массива (элемента с индексом 2)


        int[][] multiDimensionalArray = new int[4][]; //Создание пустого двумерного массива типа int,
                                                      //где длина массива, содержащего массивы int, равна 4
        int[][] twoDimensionalArray = new int[][]{ //Создание и инициализация двумерного массива типа int
                {1, 3}, //Данный массив int является первым элементом массива первой размерности
                {2}, //Данный массив int является вторым элементом массива первой размерности
                {} //Данный массив int является третьим элементом массива первой размерности. Массив может быть пустым
        };


        multiDimensionalArray[0] = new int[3]; //Запись массива int в первый элемент массива первой размерности
        multiDimensionalArray[0][0] = 5; //Запись 5 в двумерный массив по индексу 0 и 0


        int[] secondArray = twoDimensionalArray[1]; //Получение массива int с индексом 1 в двумерном массиве
        int number = twoDimensionalArray[0][1]; //Получение значения из двумерного массива по индексу 0 и 1


        System.out.println(number); //Значение number равно 3
        System.out.println(intArray); //В консоли отобразится имя класса с адресом, на который указывает ссылка, а не элементы массива
        System.out.println(java.util.Arrays.toString(intArray)); //Вывести в консоль значения одномерного массива
        System.out.println(java.util.Arrays.deepToString(twoDimensionalArray)); //Вывести в консоль значения многомерного массива
    }

}
