package programs;

import  java.util.Scanner; //импортнули сканер
public class Calculator {
    public Calculator() { //дефолтный конструктор для бинс
    }

    private String welcomeNum1 = "Здравствуйте. Это приложение \"Уничтожитель 3.0\". Пожалуйста, введите первое целое число: "; //строка для получения первого числа
    private String welcomeNum2 = "Отлично. Введите второе число: "; //строка для получения второго числа
    private String welcomeSymbol = "Какую операцию вы хотели бы совершить с этими числами? Пришлите \"+\", \"-\", \"*\" или \"/\": "; //строка для получения символа
    private String total = "Ваш результат: "; //строка для вывода итогового результата

    public String getWelcomeNum1() { //геттер для строки получения первого числа бинс
        return welcomeNum1;
    }
    public void setWelcomeNum1(String welcomeNum1) { //сеттер для строки получения первого числа бинс
        this.welcomeNum1 = welcomeNum1;
    }

    public String getWelcomeNum2() { //геттер для строки получения второго числа бинс
        return welcomeNum2;
    }
    public void setWelcomeNum2(String welcomeNum2) { //сеттер для строки получения второго числа бинс
        this.welcomeNum2 = welcomeNum2;
    }

    public String getWelcomeSymbol() { //геттер для строки получения символа бинс
        return welcomeSymbol;
    }
    public void setWelcomeSymbol(String welcomeSymbol) { //сеттер для строки получения символа бинс
        this.welcomeSymbol = welcomeSymbol;
    }

    public String getTotal() { //геттер для итогового результата бинс
        return total;
    }
    public void setTotal(String total) { //сеттер для итогового результата бинс
        this.total = total;
    }

    public static int getNumber() { //метод для считывания числа. в тех калькуляторах тупанул и сделал два отдельных метода для первого и второго числа
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        return number1;
    }

    public static char getSymbol() { // метод для считывания символа для арифметической операции
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        return symbol;
    }

    public static int total(int number1, int number2, char symbol){ //тут завис на неимоверное количество времени. все переписывал пару раз. в итоге проблема была с повторными вызовами методов в начале этого метода и инициализацией переменных.
        int totalMath = 0;
        if (symbol == '+') {
            totalMath = number1 + number2;
        }
        else if (symbol == '-') {
            totalMath = number1 - number2;
        }
        else if (symbol == '*') {
            totalMath = number1 * number2;
        }
        else if (symbol == '/') {
            totalMath = number1 / number2;
        }
        else {
            System.out.println("Пожалуйста, проверьте правильность введенных данных");
        }
        return totalMath;
    }

    public static void main(String[] args) {
        Calculator newObject = new Calculator(); //объект для юзания методов
        System.out.println(newObject.getWelcomeNum1()); //приветственная фраза
        int number1 = getNumber(); //для получения первого числа
        System.out.println(newObject.getWelcomeNum2()); //строка по получению второго числа
        int number2 = getNumber(); //для получения второго числа
        System.out.println(newObject.getWelcomeSymbol()); //строка по получению символа
        char symbol = getSymbol(); //для получения символа
        int calculator = total(number1, number2, symbol); //для получения итогового результата
        System.out.println(newObject.getTotal() + calculator); //строка с результатом
    }
}
