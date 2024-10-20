package ru.top.javacource.basic.topic1.variables;

/**
 * Переменные
 */
public class Variables {
    /**
     * Переменная класса
     */
    static int classNumber;

    /**
     * Переменная объекта
     */
    int objectNumber;

    /**
     * При запуске java программы, выполнение всегда начинается с метода main
     */
    public static void main(String[] args) {
        //Параметры метода и все переменные, созданные внутри метода, являются локальными переменными


        //Имя переменной может содержать с буквы, цифры, $, _
        //Имя переменной не может начинаться с цифры, а также содержать пробелы
        //Переменные регистрозависимы, т.е. переменная myVar и myvar это разные переменные
        double $okName;
        float _okName2;
        boolean логическаяПеременная; //Переменная может содержать буквы не только английского алфавита
        //byte 5wrongName; //Ошибка компиляции, переменная не может начинаться с цифры


        //Создание переменных без инициализации
        int localIntNumber;
        char character1, character2;


        //Создание переменных с инициализацией
        long longNumber = 1;
        byte byteNumber1 = 2, byteNumber2 = 3;


        //Присваивание значения переменной
        character1 = 'a';


        //Создание константы
        final int INT_CONST = 4;
        //intConst = 5; //Ошибка, нельзя изменять значение константы


        //Присваивание значения одной переменной другой переменной
        localIntNumber = INT_CONST;


        //Безопасное присваивание
        longNumber = localIntNumber;
        //Небезопасное присваивание, которое требует преобразование типа
        localIntNumber = (int) longNumber; //(тип_данных) - это операция преобразования типа


        //Создание обертки для типа int присваивание значения
        Integer fromInt = 10; //Упаковка (boxing)
        int fromInteger = 10; //Распаковка (unboxing)


        Long longObject = null;
        //При вызове метода будет ошибка NullPointerException
        //т.к. переменная не ссылается на объект и при передаче переменной в метод,
        //который принимает примитивный тип long произойдет unboxing,
        //что и вызовет ошибку
        //method(longObject);

    }

    /**
     * Метод, который выводит значение переменной типа long в консоль
     */
    public static void method(long longParam) {
        System.out.println(longParam); //Вывод значения переменной консоль
    }
}
