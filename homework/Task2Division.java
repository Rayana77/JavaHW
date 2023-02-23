package homework;

public class Task2Division {

    public static void main(String[] args){

        int result = divTwoNumbers(9,8);
        System.out.println(result);
    }
    private static int divTwoNumbers(int a, int b) throws ArithmeticException{
        System.out.println("Метод начал работу");
        int result = a / b;
        return result;
    }
}
