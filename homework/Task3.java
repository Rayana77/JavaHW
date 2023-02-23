package homework;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args){

        int amountInEuro;
        double dollar;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите сумму в Евро");
        amountInEuro = scanner.nextInt();
        System.out.println("Введенная сумма:" + amountInEuro);


        dollar= amountInEuro * 1.06;

        System.out.println("Сумма в Долларах:" + dollar);









}
    }