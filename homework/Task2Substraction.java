package homework;

public class Task2Substraction {

    public static void main(String[] args){

        int result = subTwoNumbers(4,12);
        System.out.println(result);
    }
    private static int subTwoNumbers(int a, int b) throws NullPointerException{
        System.out.println("Метод начал работу");
        int result = a - b;
        return result;
    }
}
