package lesson1.hw;
import java.util.Scanner;

public class Third {
    static int GetSum(int a, int b) {
        return a + b;
    }
    static int GetSubtraction(int a, int b) {
        return a - b;
    }
    static int GetProduct(int a, int b) {
        return a * b;
    }
    static double GetDivision(int a, int b) {
        return (double) a / (double) b;
    }
    static void ResultOut(int num1, int num2, String oper){
        switch(oper){
            case "+":
                System.out.printf("%d + %d = %d \n", num1, num2, GetSum(num1, num2));
                break;
            case "-":
                System.out.printf("%d - %d = %d \n", num1, num2, GetSubtraction(num1, num2));
                break;
            case "/":
                if(num2 != 0) System.out.printf("%d / %d = %5f \n", num1, num2, GetDivision(num1, num2));
                else System.out.println("Division by zero!");
                break;
            case "*":
                System.out.printf("%d * %d = %d \n", num1, num2, GetProduct(num1, num2));
                break;
            default:
                System.out.println("Wrong operation!");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter first naural number: ");
        if(scan.hasNextInt()){
            int num1 = scan.nextInt();
            System.out.printf("Enter second natural number: ");
            if(scan.hasNextInt()){
                int num2 = scan.nextInt();
                Scanner sc = new Scanner(System.in);
                System.out.printf("Enter operation (+,-,/,*): ");
                String operation = "";
                if(sc.hasNextLine()){
                    operation = sc.nextLine();
                    ResultOut(num1, num2, operation);
                }
                else System.out.println("Error!");
                sc.close();
            }
            else System.out.println("Error!");
        }
        else System.out.println("Error!");
        scan.close();
    }
}
