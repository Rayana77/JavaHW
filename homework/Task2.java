package homework;

public class Task2 {

    public static void main(String[] args) {
        int result = addTwoNumbers(10, 4);
        System.out.println(result);

    }
    private static int addTwoNumbers(int a, int b)throws NullPointerException {
        System.out.println("Метод начал работу");
        int result = a + b;
        return result;

    }




}
