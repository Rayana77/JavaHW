package homework;

public class Tak2Multiplication {

    public static void main(String[] args){

        int result = multTwoNumbers(3,8);
        System.out.println(result);
    }
    private static int multTwoNumbers(int a, int b) throws NullPointerException{
        System.out.println("Метод начал работу");
        int result = a * b;
        return result;
    }
}
